package com.containerSyncUnifiedAPI.batch.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.mapper.TmwTrktLdpAsnHeaderMapper;
import com.containerSyncUnifiedAPI.batch.models.tlLtl.TmwTrktLdpAsnHeader;

@Repository
public class TMW_TRKT_LDP_ASN_HEADER_Repo {
	
	
	private static final String GET_LDP_ASN_HEADER_QUERY = "select DISTINCT head.ASN_HEADER_ID, head.CarrierCode,head.MBLNbr from TMW_TRKT_LDP_ASN_HEADER head, TMW_TRKT_TLLTL_CARRIERS carrier  where head.TransportMode=? and head.EXPORTED=? and carrier.load_type=?";
	
	private JdbcTemplate  jdbcTemplate;
	
	@Autowired
	@Qualifier("trackitDB")
	private void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);	
	}
	
	
	public List<TmwTrktLdpAsnHeader> getCarrierCodeAndMbrInfo(String transPortMode, String exported,
			 String loadType){
		return jdbcTemplate.query(GET_LDP_ASN_HEADER_QUERY, new TmwTrktLdpAsnHeaderMapper(), new Object[] {transPortMode,exported,loadType});
	}

}
