package com.containerSyncUnifiedAPI.batch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.containerSyncUnifiedAPI.batch.models.tlLtl.TmwTrktLdpAsnHeader;

public class TmwTrktLdpAsnHeaderMapper implements RowMapper<TmwTrktLdpAsnHeader> {

	@Override
	public TmwTrktLdpAsnHeader mapRow(ResultSet rs, int rowNum) throws SQLException {
		TmwTrktLdpAsnHeader header = new TmwTrktLdpAsnHeader();
		header.setCarrierCode(rs.getString("CarrierCode"));
		header.setMblNbr(rs.getString("MBLNbr"));
		return header;
	}

	
}
