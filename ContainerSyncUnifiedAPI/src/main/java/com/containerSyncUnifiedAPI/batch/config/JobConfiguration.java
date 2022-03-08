package com.containerSyncUnifiedAPI.batch.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownHttpStatusCodeException;

import com.containerSyncUnifiedAPI.batch.entities.EVENT;
import com.containerSyncUnifiedAPI.batch.entities.OrderContainerLookup;
import com.containerSyncUnifiedAPI.batch.entities.RELATED_SHIPMENT;
import com.containerSyncUnifiedAPI.batch.entities.ROUTE_SEGMENT;
import com.containerSyncUnifiedAPI.batch.entities.ROUTE_STOP;
import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_ATTRIBUTE;
import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_IDENTIFIER;
import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_INFO;
import com.containerSyncUnifiedAPI.batch.entities.States;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_DTL;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_EQUIP_ID;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_IDENTIFIER;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_STOP;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_SHIPMENT_STOP_LOC_ID;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_STATUSUPDATES;
import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_STOP_STATUS;
import com.containerSyncUnifiedAPI.batch.entities.TMW_TRKT_LDP_ASN_HEADER;
import com.containerSyncUnifiedAPI.batch.entities.VESSELS;
import com.containerSyncUnifiedAPI.batch.models.po.PORoot;
import com.containerSyncUnifiedAPI.batch.models.po.Result;
import com.containerSyncUnifiedAPI.batch.models.shipment.SORoot;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.ShipmentITLResponse;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.ShipmentTLResponse;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.TmwTrktLdpAsnHeader;
import com.containerSyncUnifiedAPI.batch.repository.EVENT_repo;
import com.containerSyncUnifiedAPI.batch.repository.Project44ContainerSyncRepo;
import com.containerSyncUnifiedAPI.batch.repository.RELATED_SHIPMENT_repo;
import com.containerSyncUnifiedAPI.batch.repository.ROUTE_SEGMENT_repo;
import com.containerSyncUnifiedAPI.batch.repository.ROUTE_STOP_repo;
import com.containerSyncUnifiedAPI.batch.repository.SHIPMENT_ATTRIBUTE_repo;
import com.containerSyncUnifiedAPI.batch.repository.SHIPMENT_IDENTIFIER_repo;
import com.containerSyncUnifiedAPI.batch.repository.SHIPMENT_INFO_repo;
import com.containerSyncUnifiedAPI.batch.repository.SourceContainerLookup;
import com.containerSyncUnifiedAPI.batch.repository.States_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_PO_CONTAINER_LOOKUP_REPO;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_PO_CONTAINER_EVENTS_REPO;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_DTL_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_EQUIP_ID_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_IDENTIFIER_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_STOP_LOC_ID_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_STOP_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_SHIPMENT_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_STATUSUPDATES_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_STG_TL_STOP_STATUS_repo;
import com.containerSyncUnifiedAPI.batch.repository.TMW_TRKT_LDP_ASN_HEADER_Repo;
import com.containerSyncUnifiedAPI.batch.repository.Tmwstgpodeliverytimingrepo;
import com.containerSyncUnifiedAPI.batch.repository.Tmwstgpostopinforepo;
import com.containerSyncUnifiedAPI.batch.repository.Tmwstgpovesseslrepo;
import com.containerSyncUnifiedAPI.batch.repository.Tmwstgstatesrepo;
import com.containerSyncUnifiedAPI.batch.repository.VESSELS_repo;
import com.containerSyncUnifiedAPI.batch.utility.JobUtility;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class JobConfiguration {

	private static final Logger logger = LoggerFactory.getLogger(JobConfiguration.class);
	@Value("${p44.searchcriteria}")
	private String PO_NUMBER ;
	@Value("${p44.po_search_endpoint}")
	private String P44_ORDER_SEARCH_ENDPOINT ;
	@Value("${p44.getvoccontainerinfo}")
	private String P44_GET_SHIPMENT_ENDPOINT ;
	@Value("${p44.getunifiedcontainerapi}")
	private String P44_GET_SHIPMENT_HISTORY_ENDPOINT;
	@Value("${p44.gettlcontainerapi}")
	private String P44_GET_SHIPMENT_TL_ENDPOINT ;
	@Value("${p44.getltlcontainerapi}")
	private String P44_GET_SHIPMENT_LTL_ENDPOINT ;
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	private TrackitLookUpService trackitLookupService;

	@Autowired
	private TMW_STG_PO_CONTAINER_EVENTS_REPO tmwstgpocontainereventsrepo;

	@Autowired
	private Tmwstgpodeliverytimingrepo tmwstgpodeliverytimingrepo;

	@Autowired
	private TMW_PO_CONTAINER_LOOKUP_REPO tmw_po_container_lookup_repo;

	@Autowired
	private Project44ContainerSyncRepo project44ContainerSyncRepo;

	@Autowired
	private SourceContainerLookup sourceContainerLookup;

	@Autowired
	private Tmwstgpostopinforepo tmwstgpostopinforepo;

	@Autowired
	private Tmwstgpovesseslrepo tmwstgpovesseslrepo;

	@Autowired
	private Tmwstgstatesrepo tmwstgstatesrepo;

	@Autowired
	private SHIPMENT_INFO_repo shipmentInfoRepo;

	@Autowired
	private SHIPMENT_IDENTIFIER_repo shipmentIdentifierRepo;

	@Autowired
	private SHIPMENT_ATTRIBUTE_repo shipmentAttributeRepo;

	@Autowired
	private ROUTE_SEGMENT_repo routeSegmentRepo;

	@Autowired
	private ROUTE_STOP_repo routeStopRepo;

	@Autowired
	private RELATED_SHIPMENT_repo relatedShipmentRepo;

	@Autowired
	private EVENT_repo eventRepo;

	@Autowired
	private States_repo statesRepo;

	@Autowired
	private VESSELS_repo vesselsRepo;

	@Autowired
	private TMW_TRKT_LDP_ASN_HEADER_Repo tmwTrktLdpAsnHeaderRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_repo tmwStgTlShipmentRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_DTL_repo tmwStgTlShimpmentDtlRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_EQUIP_ID_repo tmwStgTlShipmentEquipIdRepo;
	
	@Autowired
	private TMW_STG_TL_STATUSUPDATES_repo tmw_stg_tl_statusupdates_repo;
	
	@Autowired
	private TMW_STG_TL_STOP_STATUS_repo tmw_stg_tl_stop_status_repo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_IDENTIFIER_repo tmwStgTlShipmentIdentifierRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW_repo tmwStgTlShipmentStopApptWindowRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_STOP_LOC_ID_repo tmwStgTlShipmentStopLocIdRepo;

	@Autowired
	private TMW_STG_TL_SHIPMENT_STOP_repo tmwStgTlShipmentStopRepo;

	/**
	 * Conatiner Sync Job Note: Make this job asynchronous
	 *
	 * @return
	 */
	@Bean
	public Job containersyncJob() {
		logger.info("=====> JobConfiguration - JOB : unifiedcontainersyncJob TaskletStep  START <=====");
		return jobBuilderFactory.get("unifiedcontainersyncJob").start(clearStagingStep()).next(prepareSourceData())
				.next(consumeSourceFilesStep()).next(mergeData()).build();
	}

	/**
	 * Merge Data
	 * 
	 * @return
	 */
	@Bean
	public Step mergeData() {
		logger.info("=====> JobConfiguration - STEP : mergeData START <=====");
		return stepBuilderFactory.get("mergeData").tasklet(mergeDataTasklet()).build();
	}

	/**
	 * Merge Data Tasklet
	 * 
	 * @return
	 */
	public Tasklet mergeDataTasklet() {
		return (stepContribution, chunkContext) -> {
			project44ContainerSyncRepo.P44_CONTAINER_SYNC();
			;
			return RepeatStatus.FINISHED;
		};
	}

	@Bean
	public Step prepareSourceData() {
		logger.info("=====> JobConfiguration - STEP : prepareSourceData START <=====");
		return stepBuilderFactory.get("prepareSourceData").tasklet(prepareSourceDataTasklet()).build();
	}

	public Tasklet prepareSourceDataTasklet() {
		return (stepContribution, chunkContext) -> {
			sourceContainerLookup.PO_CONTAINER_LOOKUP_UNIFIED();
			;
			return RepeatStatus.FINISHED;
		};
	}

	/**
	 * Initial clear/reset the staging location for already existent files.
	 * 
	 * @return
	 */
	@Bean
	public Step clearStagingStep() {
		logger.info("=====> JobConfiguration - STEP : clearStagingStep START <=====");
		return stepBuilderFactory.get("clearStagingStep").tasklet(clearStagingTasklet()).build();
	}

	@Bean
	public Step consumeSourceFilesStep() {
		logger.info("=====> JobConfiguration - STEP : consumeSourceFilesStep START <=====");
		return stepBuilderFactory.get("consumeSourceFilesStep").tasklet(consumeSourceFilesTasklet()).build();
	}

	@Bean
	public Tasklet consumeSourceFilesTasklet() {
		return (stepContribution, chunkContext) -> {
			logger.info("=====> JobConfiguration - TASKLET : consumeSourceFilesTasklet  START <=====");
			List<OrderContainerLookup> references = tmw_po_container_lookup_repo.findAll();
			Long countOfNonEmptyRecords = references.stream().filter(entity -> {
				return StringUtils.isNotBlank(entity.getORDER_NUMBER_UV());
			}).count();
			logger.info("Total Non empty records - " + countOfNonEmptyRecords);
			for (OrderContainerLookup reference : references) {
				if (StringUtils.isNotBlank(reference.getORDER_NUMBER_UV())) {
					if(reference.getLOAD_TYPE().equalsIgnoreCase("OC"))
					{
					logger.info("PO number is - " + reference.getORDER_NUMBER_UV());
					getOrderFromEndpoints(reference.getORDER_NUMBER_UV());
					}
					else if (reference.getLOAD_TYPE().equalsIgnoreCase("TL"))
					{
						saveTLShipment(reference);
					}
					else if (reference.getLOAD_TYPE().equalsIgnoreCase("LTL"))
					{
						saveShipmentLTLDetails(reference);
					}
				}
			}
			logger.info("=====> JobConfiguration - TASKLET : consumeSourceFilesTasklet  END <=====");
			return RepeatStatus.FINISHED;
		};
	}

	private HttpHeaders getTLLTLHttpHeaders() {
		HttpHeaders headersTLLTL = new HttpHeaders();
		headersTLLTL.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headersTLLTL.add("Content-Type", "application/json");
		headersTLLTL.add("Authorization", "Basic cHJvZE9UUkB0YWlsb3JlZGJyYW5kcy5jb206UHJvZEBwNDQh");
		return headersTLLTL;
	}

	@SuppressWarnings("unchecked")
	private void saveTLShipment(OrderContainerLookup reference) {
		logger.info("=====> saveTLAndLTLShipment  START <=====");
		try {

					logger.info(
							"CarrierCode is - " + reference.getCARRIER_CODE()+ "  MBLNbr - " + reference.getBOL_NUMBER());
					ResponseEntity<String> result  =null;
					try {
						RestTemplate restTemplate = new RestTemplate();
						HttpEntity<String> entity = new HttpEntity<String>(getTLLTLHttpHeaders());
						String carrierIdentifierUrl = String.format(P44_GET_SHIPMENT_TL_ENDPOINT,
								reference.getCARRIER_CODE(), reference.getBOL_NUMBER());
						result = restTemplate.exchange(carrierIdentifierUrl, HttpMethod.GET,
								entity, String.class);
						logger.info("Mannu here is the file name - " + result);
					} catch (Exception e) {
						logger.error("Exception while invoking carrier identifer service ", e.getMessage());
					}
					if (result != null && result.getStatusCode() == HttpStatus.OK) {
						ObjectMapper objectMapper = new ObjectMapper();
						ShipmentTLResponse shipmentTLResponse = objectMapper.readValue(result.getBody(),
								ShipmentTLResponse.class);
						System.out.println(" ShipmentTLResponse.getSensorHistories().size() is - "
								+ shipmentTLResponse.getSensorHistories().size());
						System.out.println(" ShipmentTLResponse.getInfoMessages().size() is - "
								+ shipmentTLResponse.getInfoMessages().size());
						System.out.println(" ShipmentTLResponse.getLatestStopStatuses().size() is - "
								+ shipmentTLResponse.getLatestStopStatuses().size());
						Map<String, Object> entityMap = JobUtility.getShipmentCarrierCodeInfoMap(shipmentTLResponse,
								reference.getBOL_NUMBER());
						tmwStgTlShipmentRepo.saveAll((List<TMW_STG_TL_SHIPMENT>) entityMap.get("shipmentInfo"));
						tmwStgTlShipmentStopRepo
								.saveAll((List<TMW_STG_TL_SHIPMENT_STOP>) entityMap.get("shipmentStopInfo"));
						tmwStgTlShipmentStopLocIdRepo.saveAll(
								(List<TMW_STG_TL_SHIPMENT_STOP_LOC_ID>) entityMap.get("shipmentStopLocIdInfo"));
						tmwStgTlShipmentStopApptWindowRepo
								.saveAll((List<TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW>) entityMap
										.get("shipmentStopAppWindowInfo"));
						tmwStgTlShipmentIdentifierRepo
								.saveAll((List<TMW_STG_TL_SHIPMENT_IDENTIFIER>) entityMap.get("shipmentIdentiferInfo"));
						tmwStgTlShipmentEquipIdRepo
								.saveAll((List<TMW_STG_TL_SHIPMENT_EQUIP_ID>) entityMap.get("shipmentEquipIdInfo"));
						tmwStgTlShimpmentDtlRepo
								.saveAll((List<TMW_STG_TL_SHIPMENT_DTL>) entityMap.get("shipmentDetailInfo"));
						tmw_stg_tl_statusupdates_repo
						.saveAll((List<TMW_STG_TL_STATUSUPDATES>) entityMap.get("shipmentstatuses"));
						tmw_stg_tl_stop_status_repo
						.saveAll((List<TMW_STG_TL_STOP_STATUS>) entityMap.get("shipmentlaststopstatus"));
						logger.info("TL Shipment Details saved Successfully...");
					}
		}catch (HttpServerErrorException ex)
        {
        	ex.printStackTrace();
        	return;
        }catch (HttpClientErrorException  ex)
        {
        	ex.printStackTrace();
        	return;
        }
        catch (UnknownHttpStatusCodeException   ex)
        {
        	ex.printStackTrace();
        	return;
        } catch (Exception e) {
			logger.error("Exception while building and saving TL LTL shipment details ", e);
			return;
		}
	}

	private void saveShipmentLTLDetails(OrderContainerLookup reference) throws JsonProcessingException, JsonMappingException {
		try {
				logger.info("CarrierCode is - " + reference.getCARRIER_CODE() + "  MBLNbr - " + reference.getBOL_NUMBER());
				RestTemplate restTemplate = new RestTemplate();
				HttpEntity<String> entity = new HttpEntity<String>(getTLLTLHttpHeaders());
				String carrierIdentifierUrl = String.format(P44_GET_SHIPMENT_LTL_ENDPOINT, reference.getCARRIER_CODE(),
						reference.getBOL_NUMBER());
				ResponseEntity<String> result = restTemplate.exchange(carrierIdentifierUrl, HttpMethod.GET, entity,
						String.class);
				logger.info("Mannu here is the file name - " + result);
				if (result != null && result.getStatusCode() == HttpStatus.OK) {
					ObjectMapper objectMapper = new ObjectMapper();
					ShipmentITLResponse shipmentITLResponse = objectMapper.readValue(result.getBody(),
							ShipmentITLResponse.class);
					System.out.println(" ShipmentTLResponse.getInfoMessages().size() is - "
							+ shipmentITLResponse.getInfoMessages().size());
					System.out.println(" ShipmentTLResponse.getLatestStopStatuses().size() is - "
							+ shipmentITLResponse.getLatestStopStatuses().size());
					Map<String, Object> entityMap = JobUtility.getShipmentCarrierCodeITLInfoMap(shipmentITLResponse,
							reference.getBOL_NUMBER());
					 tmwStgTlShipmentRepo.saveAll((List<TMW_STG_TL_SHIPMENT>)
					 entityMap.get("shipmentInfo"));
					 tmwStgTlShipmentStopRepo.saveAll((List<TMW_STG_TL_SHIPMENT_STOP>)
					 entityMap.get("shipmentStopInfo"));
					 tmwStgTlShipmentStopLocIdRepo.saveAll((List<TMW_STG_TL_SHIPMENT_STOP_LOC_ID>)
				     entityMap.get("shipmentStopLocIdInfo"));
					 tmwStgTlShipmentStopApptWindowRepo.saveAll((List<TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW>)
					 entityMap.get("shipmentStopAppWindowInfo"));
					 tmwStgTlShipmentIdentifierRepo.saveAll((List<TMW_STG_TL_SHIPMENT_IDENTIFIER>)
					 entityMap.get("shipmentIdentiferInfo"));
					 tmwStgTlShipmentEquipIdRepo.saveAll((List<TMW_STG_TL_SHIPMENT_EQUIP_ID>)
					 entityMap.get("shipmentEquipIdInfo"));
					 tmwStgTlShimpmentDtlRepo.saveAll((List<TMW_STG_TL_SHIPMENT_DTL>)
					 entityMap.get("shipmentDetailInfo"));
					logger.info("TL Shipment Details saved Successfully...");
				}
		} catch (HttpServerErrorException ex)
        {
        	ex.printStackTrace();
        	return;
        }catch (HttpClientErrorException  ex)
        {
        	ex.printStackTrace();
        	return;
        }
        catch (UnknownHttpStatusCodeException   ex)
        {
        	ex.printStackTrace();
        	return;
        }catch (Exception e) {
			logger.error("Exception while building and saving  LTL shipment details ", e);
			return;
		}
	}

	private HttpHeaders getHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Content-Type", "application/json");
		headers.add("Authorization", "Basic aW50ZWdyYXRpb251c2VyQHRidGVzdC5jb206UHJvamVjdDQ0IQ==");
		return headers;
	}

	/**
	 * Connsumes XML from the getOrder Search.
	 */
	@SuppressWarnings("unchecked")
	public void getOrderFromEndpoints(String poNumber) throws IOException {
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<String> entity = new HttpEntity<String>("{\r\n\"orderIdentifiers\": [\"" + poNumber + "\"]\r\n}\r\n",
					getHttpHeaders());
			logger.info("Request payload is -" + "{\r\n\"orderIdentifiers\": [\"" + poNumber + "\"]\r\n}\r\n");
			ResponseEntity<String> result = restTemplate.exchange(P44_ORDER_SEARCH_ENDPOINT, HttpMethod.POST, entity,
					String.class);
			logger.info("Mannu here is the file name - " + result);
			if (result != null && result.getStatusCode() == HttpStatus.OK) {
				ObjectMapper objectMapper = new ObjectMapper();
				PORoot poroot = objectMapper.readValue(result.getBody(), PORoot.class);
				System.out.println(poNumber + " poroot.getResults().size() is - " + poroot.getResults().size());
				for (Result resultObj : poroot.getResults()) {
					for (String shipmentId : resultObj.getShipmentIds()) {
						String historyEndPoint = P44_GET_SHIPMENT_HISTORY_ENDPOINT + shipmentId + "/tracking/history";
						HttpEntity<String> entityHeaders = new HttpEntity<String>(getHttpHeaders());
						ResponseEntity<String> historyResult = restTemplate.exchange(historyEndPoint, HttpMethod.GET,
								entityHeaders, String.class);
						if (historyResult != null && historyResult.getStatusCode() == HttpStatus.OK) {
							try {
								SORoot historyPORoot = objectMapper.readValue(historyResult.getBody(), SORoot.class);
								logger.info("Mannu Pandey poNumber number is - " +poNumber );
								Map<String, Object> entityMap = JobUtility.getStagingObject(historyPORoot, poNumber);
								shipmentInfoRepo.save((SHIPMENT_INFO) entityMap.get("shipmentInfo"));
								shipmentIdentifierRepo
										.saveAll((List<SHIPMENT_IDENTIFIER>) entityMap.get("shipmentIdentifiers"));
								shipmentAttributeRepo
										.saveAll((List<SHIPMENT_ATTRIBUTE>) entityMap.get("shipmentAttributes"));
								routeStopRepo.saveAll((List<ROUTE_STOP>) entityMap.get("routeStops"));
								routeSegmentRepo.saveAll((List<ROUTE_SEGMENT>) entityMap.get("routeSegments"));
								relatedShipmentRepo.saveAll((List<RELATED_SHIPMENT>) entityMap.get("relatedShipments"));
								eventRepo.saveAll((List<EVENT>) entityMap.get("containerEvents"));
								statesRepo.saveAll((List<States>) entityMap.get("states"));
								vesselsRepo.saveAll((List<VESSELS>) entityMap.get("vessels"));
							} catch (Exception e) {
								logger.error("Exception while building and saving instance ", e);
							}
						}
					}
				}
			}
			
		}catch (HttpServerErrorException ex)
        {
        	ex.printStackTrace();
        	return;
        }catch (HttpClientErrorException  ex)
        {
        	ex.printStackTrace();
        	return;
        }
        catch (UnknownHttpStatusCodeException   ex)
        {
        	ex.printStackTrace();
        	return;
        }catch (Exception e) {
			logger.error("Exception while building and saving  LTL shipment details ", e);
			return;
		}
		
		

	}

	/**
	 * Clear Staging Tasklet.
	 * 
	 * @return
	 */
	public Tasklet clearStagingTasklet() {
		return ((stepContribution, chunkContext) -> {
			logger.info("======> JobConfiguration - TASKLET : clearStagingTasklet START <=======");
			// clearStagingLocation();
			clearStagedDBRecords();
			logger.info("======> JobConfiguration - TASKLET : clearStagingTasklet END <=======");
			return RepeatStatus.FINISHED;
		});
	}

	private void clearStagedDBRecords() {
		shipmentInfoRepo.deleteAllInBatch();
		shipmentIdentifierRepo.deleteAllInBatch();
		shipmentAttributeRepo.deleteAllInBatch();
		routeStopRepo.deleteAllInBatch();
		routeSegmentRepo.deleteAllInBatch();
		relatedShipmentRepo.deleteAllInBatch();
		eventRepo.deleteAllInBatch();
		tmw_po_container_lookup_repo.deleteAllInBatch();

	}

	/**
	 * Copies from Source Location to Staged Location
	 * 
	 * @param sourceFile
	 * @throws IOException
	 */
	private void copyToStagedLocation(File sourceFile) throws IOException {
		logger.info("Absolute path is - " + sourceFile.getAbsolutePath());
		logger.info("Source File name is : " + sourceFile.getName());
		FileChannel source = new FileInputStream(sourceFile).getChannel();
		String STAGING_FILE_LOCATION = trackitLookupService.getTrackitLookUpRepository()
				.get("UNIVERSETOTRACKIT_FILES_STAGING_LOCATION");
//        String fileName = "partition" + sourceFile.getName() + fileCounter;
		String fileName = sourceFile.getName();
		File fileWithPath = new File(STAGING_FILE_LOCATION, fileName);
		fileWithPath.getParentFile().mkdirs();
		fileWithPath.createNewFile();
		FileChannel destination = new FileOutputStream(fileWithPath).getChannel();
		destination.transferFrom(source, 0, source.size());

	}
}
