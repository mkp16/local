package com.containerSyncUnifiedAPI.batch.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class TMW_TRKT_LDP_ASN_HEADER {
	
	@Id
	@Column(name ="ASN_HEADER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long asnHeaderId;
	
	@Column(name ="CarrierCode")
	private String carrierCode;
	@Column(name ="MBLNbr")
	private String mblNbr;
	public long getAsnHeaderId() {
		return asnHeaderId;
	}
	public void setAsnHeaderId(long asnHeaderId) {
		this.asnHeaderId = asnHeaderId;
	}
	

}
