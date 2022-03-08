package com.containerSyncUnifiedAPI.batch.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.containerSyncUnifiedAPI.batch.entities.*;
import com.containerSyncUnifiedAPI.batch.models.shipment.*;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.LatestStopStatuses;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.LocationIdentifier;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.Shipment;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.ShipmentITLResponse;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.ShipmentStop;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.ShipmentTLResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

public class JobUtility {

	private static final Logger logger = LoggerFactory.getLogger(JobUtility.class);

	/**
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date getEntityDate(String date) throws ParseException {
		Date responseDate = null;
		if (Objects.nonNull(date) && StringUtils.isNotBlank(date)) {
			DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
			responseDate = formatter.parse(date);
		}
		return responseDate;
	}

	public static ArrayList<TMW_STG_PO_CONTAINER_EVENTS> getStagingErrorObject(SORoot soroot) {
		ArrayList<TMW_STG_PO_CONTAINER_EVENTS> tmwStgpocontrevents = new ArrayList<TMW_STG_PO_CONTAINER_EVENTS>();
		return tmwStgpocontrevents;
	}

	/**
	 * 
	 * @param trackedShipment
	 * @return
	 * @throws ParseException
	 */
	public static HashMap<String, Object> getStagingObject(SORoot soRoot, String ordernumber) throws ParseException {
		logger.info("=============> JobUtility : Getting stagin Object <===========");
		HashMap<String, Object> entityMap = new HashMap<String, Object>();
		entityMap.put("shipmentInfo", buildShipmentInfo(soRoot.getShipment(), ordernumber));
		entityMap.put("shipmentIdentifiers", buildShipmentIdentifiers(soRoot.getShipment(), ordernumber));
		entityMap.put("shipmentAttributes", buildShipmentAttributes(soRoot.getShipment(), ordernumber));
		entityMap.put("routeStops", buildRouteStops(soRoot.getShipment(), ordernumber));
		entityMap.put("routeSegments", buildRouteSegments(soRoot.getShipment(), ordernumber));
		entityMap.put("relatedShipments", buildRelatedShipments(soRoot.getShipment(), ordernumber));
		entityMap.put("containerEvents", buildEvents(soRoot.getShipment(), soRoot.getEvents(), ordernumber));
		entityMap.put("states", buildStates(soRoot.getShipment(),soRoot.getStates(), ordernumber));
		entityMap.put("vessels", buildVessels(soRoot.getShipment(),soRoot.getVessels(), ordernumber));
		return entityMap;
	}
	
	private static List<States> buildStates(ShipmentRoot shipment,List<State> states, String ordernumber) {
		List<States> statesList = new ArrayList<>();

		for (State state : states) {
			States st = new States();
			st.setShipmentId(shipment.getId());
			st.setStateCode(state.getStateCode());
			st.setStartTime(state.getStartTime());
			st.setEndTime(state.getEndTime());
			st.setStopNumber(state.getStopNumber());
			st.setVesselNumber(state.getVesselNumber());
			statesList.add(st);
		}

		return statesList;
	}
	
	private static List<VESSELS> buildVessels(ShipmentRoot shipment,List<Vessel> vessels, String ordernumber) {
		List<VESSELS> vesselsList = new ArrayList<>();
		if (vesselsList != null && vesselsList.size() > 0) {
			for (Vessel vessel : vessels) {
				VESSELS vl = new VESSELS();
				vl.setShipmentId(shipment.getId());
				vl.setVesselNumber(vessel.getVesselNumber());
				vl.setImo(vessel.getImo());
				vl.setMmsi(vessel.getMmsi());
				vl.setName(vessel.getName());
				vl.setCallSign(vessel.getCallSign());
				vl.setShipType(vessel.getShipType());
				vl.setLength(vessel.getLength());
				vl.setWidth(vessel.getWidth());
				vl.setDraught(vessel.getDraught());
				vl.setLengthUnit(vessel.getLengthUnit());
				vesselsList.add(vl);
			}
		}

		return vesselsList;
	}

	private static List<EVENT> buildEvents(ShipmentRoot shipment, List<Event> events, String ordernumber) {
		List<EVENT> eventList = new ArrayList<>();
		if (eventList!=null && eventList.size()>0) {
		for (Event event : events) {
			EVENT ev = new EVENT();
			ev.setShipmentId(shipment.getId());
			ev.setDateTime(event.getDateTime());
			ev.setRouteSegmentId(event.getRouteSegmentId());
			ev.setStopId(event.getStopId());
			ev.setType(event.getType());
			eventList.add(ev);
		}
		}

		return eventList;
	}

	private static List<RELATED_SHIPMENT> buildRelatedShipments(ShipmentRoot shipment, String ordernumber) {
		List<RELATED_SHIPMENT> relatedShipmentList = new ArrayList<>();

		for (RelatedShipment relatedShipmentData : shipment.getRelatedShipments()) {
			for (Identifier identifier : relatedShipmentData.getIdentifiers()) {
				RELATED_SHIPMENT relShipment = new RELATED_SHIPMENT();
				relShipment.setIdentifierType(identifier.getType());
				relShipment.setIdentifierValue(identifier.getValue());
				relShipment.setRelatedShipmentId(relatedShipmentData.getId());
				relShipment.setShipmentId(shipment.getId());
				relatedShipmentList.add(relShipment);
			}
		}
		return relatedShipmentList;
	}

	private static List<ROUTE_SEGMENT> buildRouteSegments(ShipmentRoot shipment, String ordernumber) {
		List<ROUTE_SEGMENT> routeSegmentList = new ArrayList<>();

		for (RouteSegment routeSegment : shipment.getRouteInfo().getRouteSegments()) {
			if (routeSegment.getIdentifiers() != null && !routeSegment.getIdentifiers().isEmpty()) {
				for (Identifier identifier : routeSegment.getIdentifiers()) {
					ROUTE_SEGMENT route = new ROUTE_SEGMENT();
					route.setShipmentId(shipment.getId());
					route.setRouteSegmentId(routeSegment.getId());
					route.setFromStopId(routeSegment.getFromStopId());
					route.setToStopId(routeSegment.getToStopId());
					route.setTransportationMode(routeSegment.getTransportationMode());
					route.setIdentifierType(identifier.getType());
					route.setIdentifierValue(identifier.getValue());
					routeSegmentList.add(route);
				}

			} else {
				ROUTE_SEGMENT route = new ROUTE_SEGMENT();
				route.setShipmentId(shipment.getId());
				route.setRouteSegmentId(routeSegment.getId());
				route.setFromStopId(routeSegment.getFromStopId());
				route.setToStopId(routeSegment.getToStopId());
				route.setTransportationMode(routeSegment.getTransportationMode());
				routeSegmentList.add(route);
			}

		}

		return routeSegmentList;
	}

	private static SHIPMENT_INFO buildShipmentInfo(ShipmentRoot shipment, String ordernumber) {
		SHIPMENT_INFO info = new SHIPMENT_INFO();
		info.setOrderNumber(ordernumber);
		info.setShipmentId(shipment.getId());
		info.setShipmentShareLink(shipment.getShipmentShareLink());
		return info;
	}

	private static List<ROUTE_STOP> buildRouteStops(ShipmentRoot shipment, String ordernumber) {
		List<ROUTE_STOP> routeStopList = new ArrayList<>();
		if (shipment.getRouteInfo() != null && shipment.getRouteInfo().getStops() != null
				&& !shipment.getRouteInfo().getStops().isEmpty()) {
			for (Stop stop : shipment.getRouteInfo().getStops()) {
				ROUTE_STOP routeStop = new ROUTE_STOP();
				routeStop.setShipmentId(shipment.getId());
				routeStop.setRouteId(stop.getId());
				routeStop.setType(stop.getType());
				if (stop.getLocation() != null && stop.getLocation().getIdentifiers() != null
						&& !stop.getLocation().getIdentifiers().isEmpty()) {
					for (Identifier identifier : stop.getLocation().getIdentifiers()) {
						routeStop.setLocationName(stop.getLocation().getName());
						routeStop.setLatitude(stop.getLocation().getCoordinates().getLatitude());
						routeStop.setLongitude(stop.getLocation().getCoordinates().getLatitude());
						routeStop.setIdentifierType(identifier.getType());
						routeStop.setIdentifierValue(identifier.getValue());
					}
				}
				routeStopList.add(routeStop);
			}
		}
		return routeStopList;
	}

	private static List<SHIPMENT_ATTRIBUTE> buildShipmentAttributes(ShipmentRoot shipment, String ordernumber) {
		List<SHIPMENT_ATTRIBUTE> shimentAttrList = new ArrayList<>();
		for (Attribute attribute : shipment.getAttributes()) {
			SHIPMENT_ATTRIBUTE shipAttribute = new SHIPMENT_ATTRIBUTE();
			shipAttribute.setName(attribute.getName());
			shipAttribute.setValue(String.join(",", attribute.getValues()));
			shipAttribute.setShipmentId(shipment.getId());
			shimentAttrList.add(shipAttribute);
		}
		return shimentAttrList;
	}

	private static List<SHIPMENT_IDENTIFIER> buildShipmentIdentifiers(ShipmentRoot shipment, String ordernumber) {
		List<SHIPMENT_IDENTIFIER> identifierList = new ArrayList<>();
		for (ShipmentIdentifier identifier : shipment.getIdentifiers()) {
			SHIPMENT_IDENTIFIER shipIdentifier = new SHIPMENT_IDENTIFIER();
			shipIdentifier.setType(identifier.getType());
			shipIdentifier.setValue(identifier.getValue());
			shipIdentifier.setShipmentId(shipment.getId());
			identifierList.add(shipIdentifier);
		}
		return identifierList;
	}

	public static Map<String, Object> getShipmentCarrierCodeInfoMap(ShipmentTLResponse shipmentTLResponse,
			String mblNbr) {
		logger.info("=============> JobUtility : Getting getShipmentCarrierCodeInfoMap Object <===========");
		HashMap<String, Object> entityMap = new HashMap<String, Object>();
		entityMap.put("shipmentInfo", buildMbrShipmentInfo(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentStopInfo", buildMbrShipmentStopInfo(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentStopLocIdInfo", buildMbrShipmentStopLocIdInfo(shipmentTLResponse,mblNbr));
		entityMap.put("shipmentStopAppWindowInfo", buildMbrShipmentStopAppWindowInfo(shipmentTLResponse,mblNbr));
		entityMap.put("shipmentIdentiferInfo", buildMbrShipmentIdentiferInfo(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentEquipIdInfo", buildMbrShipmentEquipIdInfo(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentDetailInfo", buildMbrShipmentDetailInfo(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentstatuses", buildMbrShipmentStatuses(shipmentTLResponse, mblNbr));
		entityMap.put("shipmentlaststopstatus", buildMbrShipmentlaststopstatus(shipmentTLResponse, mblNbr));
		return entityMap;
	}

	private static ArrayList<TMW_STG_TL_STOP_STATUS>  buildMbrShipmentlaststopstatus(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		ArrayList<TMW_STG_TL_STOP_STATUS> shipmentlaststopstatuses = new ArrayList<>();
		
		for(int i = 0; i < shipmentTLResponse.getLatestStopStatuses().size(); i++)
		{
			TMW_STG_TL_STOP_STATUS shipmentlaststopstatus = new TMW_STG_TL_STOP_STATUS();
			shipmentlaststopstatus.setMBOLNUMBER(mblNbr);
			shipmentlaststopstatus.setARRIVALCODE(shipmentTLResponse.getLatestStopStatuses().get(i).getArrivalCode());
			shipmentlaststopstatus.setSTATUSCODE(shipmentTLResponse.getLatestStopStatuses().get(i).getStatusCode());
			shipmentlaststopstatus.setSTOPNUMBER(shipmentTLResponse.getLatestStopStatuses().get(i).getStopNumber());
			
			shipmentlaststopstatuses.add(shipmentlaststopstatus);
		}
		return shipmentlaststopstatuses;
	}

	private static List<TMW_STG_TL_STATUSUPDATES> buildMbrShipmentStatuses(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		ArrayList<TMW_STG_TL_STATUSUPDATES> shipmentstatuses = new ArrayList<>();
		
		for(int i = 0; i < shipmentTLResponse.getStatusUpdates().size(); i++)
		{
			TMW_STG_TL_STATUSUPDATES shipmentstatus = new TMW_STG_TL_STATUSUPDATES();
			shipmentstatus.setMBOLNUMBER(mblNbr);
			shipmentstatus.setSTATUSCODE(shipmentTLResponse.getStatusUpdates().get(i).getStatusCode());
			shipmentstatus.setSTATUSREASONCODE(shipmentTLResponse.getStatusUpdates().get(i).getStatusReason().getCode());
			shipmentstatus.setSTATUSREASONDESC(shipmentTLResponse.getStatusUpdates().get(i).getStatusReason().getDescription());
			shipmentstatus.setSTOPNUMBER(shipmentTLResponse.getStatusUpdates().get(i).getStatusCode());
			shipmentstatus.setTIMESTAMP(shipmentTLResponse.getStatusUpdates().get(i).getTimestamp());
			shipmentstatuses.add(shipmentstatus);
		}
		
		
		return shipmentstatuses;
	}

	private static List<TMW_STG_TL_SHIPMENT_DTL> buildMbrShipmentDetailInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		List<TMW_STG_TL_SHIPMENT_DTL> shipmentDtlList = new ArrayList<>();
		if(shipmentTLResponse != null && shipmentTLResponse.getShipment() != null ) {
			Shipment shipment = shipmentTLResponse.getShipment();
				if(shipment.getShippingDetails() != null ) {
					if(shipment.getShippingDetails().getTruckDetails() != null) {
						TMW_STG_TL_SHIPMENT_DTL shipmentdtl = new TMW_STG_TL_SHIPMENT_DTL();
						shipmentdtl.setMblNbr(mblNbr);
						shipmentdtl.setMultipleDrivers(shipment.getShippingDetails().isMultipleDrivers() ? "true" : "false");
						if(shipment.getShippingDetails().getTruckDetails().getTruckDimensions() != null) {
							shipmentdtl.setTruckHeight(shipment.getShippingDetails().getTruckDetails().getTruckDimensions().getHeight());
							shipmentdtl.setTruckLength(shipment.getShippingDetails().getTruckDetails().getTruckDimensions().getLength());
							shipmentdtl.setTruckWeight(shipment.getShippingDetails().getTruckDetails().getTruckDimensions().getWeight());
						}
						if(shipment.getShippingDetails().getHazmatDetails() != null) {
							shipmentdtl.setHazmatDetails("");
						}
						shipmentDtlList.add(shipmentdtl);
					}
					
				}
		}
		return shipmentDtlList;
		
	}

	private static List<TMW_STG_TL_SHIPMENT_EQUIP_ID> buildMbrShipmentEquipIdInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		List<TMW_STG_TL_SHIPMENT_EQUIP_ID> equipIdList = new ArrayList<>();
		if(shipmentTLResponse != null && shipmentTLResponse.getShipment() != null) {
			Shipment shipment = shipmentTLResponse.getShipment();
				if(shipment.getEquipmentIdentifiers() != null && !shipment.getEquipmentIdentifiers().isEmpty()) {
					for(com.containerSyncUnifiedAPI.batch.models.tlLtl.EquipmentIdentifier equipIdInfo : shipment.getEquipmentIdentifiers()) {
					TMW_STG_TL_SHIPMENT_EQUIP_ID equipId = new TMW_STG_TL_SHIPMENT_EQUIP_ID();
					equipId.setMblNbr(mblNbr);
					equipId.setCarrierValue(equipIdInfo.getValue());
					equipId.setType(equipIdInfo.getType());
					equipIdList.add(equipId);
				}
			}
		}
		return equipIdList;
	}

	private static List<TMW_STG_TL_SHIPMENT_IDENTIFIER> buildMbrShipmentIdentiferInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		// TODO Auto-generated method stub
		List<TMW_STG_TL_SHIPMENT_IDENTIFIER> identifierList = new ArrayList<>();
		if(shipmentTLResponse != null && shipmentTLResponse.getShipment() != null) {
			Shipment shipment = shipmentTLResponse.getShipment();
				if(shipment.getCarrierIdentifier() != null) {
						TMW_STG_TL_SHIPMENT_IDENTIFIER identifier = new TMW_STG_TL_SHIPMENT_IDENTIFIER();
						identifier.setMblNbr(mblNbr);
						identifier.setCarrierValue(shipment.getCarrierIdentifier().getValue());
						identifier.setType(shipment.getCarrierIdentifier().getType());
						identifierList.add(identifier);
				}
			}
		return identifierList;
	}

	private static List<TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW> buildMbrShipmentStopAppWindowInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		List<TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW> appWindowList = new ArrayList<>();
		if(shipmentTLResponse != null && shipmentTLResponse.getShipment() != null ) {
			Shipment shipment = shipmentTLResponse.getShipment();
				if(shipment.getShipmentStops() != null && !shipment.getShipmentStops().isEmpty()) {
					for(ShipmentStop shipmentStop : shipment.getShipmentStops()) {
						if(shipmentStop.getAppointmentWindow() != null) {
							TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW apptWindow= new TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW();
							apptWindow.setBolnumber(mblNbr);
							apptWindow.setStopId(String.valueOf(shipmentStop.getStopNumber()));
							apptWindow.setStartDateTime(shipmentStop.getAppointmentWindow().getStartDateTime());
							apptWindow.setLocalTimeZoneIDentifier(shipmentStop.getAppointmentWindow().getLocalTimeZoneIdentifier());
							apptWindow.setEndDateTime(shipmentStop.getAppointmentWindow().getEndDateTime());
							appWindowList.add(apptWindow);
						}
					}
					
				}
		}
		return appWindowList;
	}

	private static List<TMW_STG_TL_SHIPMENT_STOP_LOC_ID> buildMbrShipmentStopLocIdInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		List<TMW_STG_TL_SHIPMENT_STOP_LOC_ID> stopLocIdList = new ArrayList<>();
		if(shipmentTLResponse.getShipment() != null) {
			Shipment shipment = shipmentTLResponse.getShipment();
				if(shipment.getShipmentStops() != null && !shipment.getShipmentStops().isEmpty()) {
					for(ShipmentStop shipmentStop : shipment.getShipmentStops()) {
						if(shipmentStop.getLocationIdentifiers() != null && !shipmentStop.getLocationIdentifiers().isEmpty()) {
							for(LocationIdentifier locationIdentifiers : shipmentStop.getLocationIdentifiers()) {
								TMW_STG_TL_SHIPMENT_STOP_LOC_ID locID = new TMW_STG_TL_SHIPMENT_STOP_LOC_ID();
								locID.setBolnumber(mblNbr);
								locID.setType(locationIdentifiers.getType());
								locID.setValue(locationIdentifiers.getValue());
								locID.setStopId(String.valueOf(shipmentStop.getStopNumber()));
								stopLocIdList.add(locID);
							}
						
						}
					}
				}
		}
		return stopLocIdList;
	}
	

	private static List<TMW_STG_TL_SHIPMENT_STOP> buildMbrShipmentStopInfo(ShipmentTLResponse shipmentTLResponse, String mblNbr) {
		List<TMW_STG_TL_SHIPMENT_STOP> tlShipmentStopList = new ArrayList<>();
		if (shipmentTLResponse != null && shipmentTLResponse.getShipment() != null) {
			Shipment shimpent = shipmentTLResponse.getShipment();
				if (shimpent.getShipmentStops() != null && !shimpent.getShipmentStops().isEmpty()) {
					for (ShipmentStop shipmentStops : shimpent.getShipmentStops()) {
						TMW_STG_TL_SHIPMENT_STOP shipmentStop = new TMW_STG_TL_SHIPMENT_STOP();
						//shipmentStop.setId(shipmentStops.getId());
						shipmentStop.setMblNbr(mblNbr);
						shipmentStop.setUuid(shipmentStops.getUuid());
						shipmentStop.setStopNumber(String.valueOf(shipmentStops.getStopNumber()));
						shipmentStop.setStopName(shipmentStops.getStopName());
						if(shipmentStops.getAppointmentWindow() != null) {
							shipmentStop.setAppEndDateTime(shipmentStops.getAppointmentWindow().getEndDateTime());
							shipmentStop.setAppLocalTimezoneIdentifier(shipmentStops.getAppointmentWindow().getLocalTimeZoneIdentifier());
							shipmentStop.setAppStartDateTime(shipmentStops.getAppointmentWindow().getStartDateTime());
						}
						if (shipmentStops.getGeoCoordinates() != null) {
							shipmentStop.setLongitude(String.valueOf(shipmentStops.getGeoCoordinates().getLatitude()));
							if (shipmentStops.getLocation() != null) {
								if (shipmentStops.getLocation().getAddress() != null) {
									shipmentStop.setLocState(shipmentStops.getLocation().getAddress().getState());
									shipmentStop.setLocPostalCode(shipmentStops.getLocation().getAddress().getPostalCode());
									shipmentStop.setLocCountry(shipmentStops.getLocation().getAddress().getCountry());
									shipmentStop.setLocCity(shipmentStops.getLocation().getAddress().getCity());
									if (shipmentStops.getLocation().getAddress().getAddressLines() != null && !shipmentStops.getLocation().getAddress().getAddressLines().isEmpty()) {
										shipmentStop.setLocAddresLine1(shipmentStops.getLocation().getAddress().getAddressLines().get(0));
										if (shipmentStops.getLocation().getAddress().getAddressLines().size() > 1) {
											shipmentStop.setLocAddresLine2(shipmentStops.getLocation().getAddress().getAddressLines().get(1));
										}
										if (shipmentStops.getLocation().getAddress().getAddressLines().size() > 2) {
											shipmentStop.setLocAddresLine3(shipmentStops.getLocation().getAddress().getAddressLines().get(2));
										}
									}
								}
								if (shipmentStops.getLocation().getContact() != null) {
									shipmentStop.setLocPhoneNumber(shipmentStops.getLocation().getContact().getPhoneNumber());
									shipmentStop.setLocCompanyName(shipmentStops.getLocation().getContact().getCompanyName());
								}
							}

						}
						tlShipmentStopList.add(shipmentStop);
					}

			}
		}
		return tlShipmentStopList;
	}

	private static List<TMW_STG_TL_SHIPMENT> buildMbrShipmentInfo(ShipmentTLResponse shipmentTLResponse,
			String mblNbr) {
		List<TMW_STG_TL_SHIPMENT> identifierList = new ArrayList<>();
		if (shipmentTLResponse != null && shipmentTLResponse.getShipment() != null) {
			Shipment shipmentInfo = shipmentTLResponse.getShipment();
				TMW_STG_TL_SHIPMENT tlShipment = new TMW_STG_TL_SHIPMENT();
				tlShipment.setMblNbr(mblNbr);
			//	tlShipment.setId(shipmentInfo.getId());
				if (shipmentInfo.getCarrierIdentifier() != null) {
					tlShipment.setCarrierType(shipmentInfo.getCarrierIdentifier().getType());
					tlShipment.setCarrierValue(shipmentInfo.getCarrierIdentifier().getValue());
				}

				if (shipmentInfo.getSensors() != null && !shipmentInfo.getSensors().isEmpty()) {
					tlShipment.setSensors(shipmentInfo.getSensors().get(0));
				}
				if (shipmentInfo.getApiConfiguration() != null) {
					tlShipment.setFallBackToDefaultAccountGroup(
							shipmentInfo.getApiConfiguration().isFallBackToDefaultAccountGroup());
				}
				if (shipmentInfo.getTrackingDetails() != null && !shipmentInfo.getTrackingDetails().isEmpty()) {
					tlShipment.setTrackingType(shipmentInfo.getTrackingDetails().get(0).getTrackingType());
				}
				if (shipmentTLResponse.getLatestStatusUpdate() != null) {
					tlShipment.setLatestTimestamp(shipmentTLResponse.getLatestStatusUpdate().getTimestamp());
					tlShipment.setLatestStatusCode(shipmentTLResponse.getLatestStatusUpdate().getStatusCode());
					if (shipmentTLResponse.getLatestStatusUpdate().getStatusReason() != null) {
						tlShipment.setLatestStatusReasonCode(
								shipmentTLResponse.getLatestStatusUpdate().getStatusReason().getCode());
						tlShipment.setLatestStatusCodeDesc(
								shipmentTLResponse.getLatestStatusUpdate().getStatusReason().getDescription());
					}
				}
				identifierList.add(tlShipment);
			
		}
		return identifierList;
	}

	public static Map<String, Object> getShipmentCarrierCodeITLInfoMap(ShipmentITLResponse shipmentITLResponse,
			String mblNbr) {
		// TODO Auto-generated method stub
		return null;
	}

}
