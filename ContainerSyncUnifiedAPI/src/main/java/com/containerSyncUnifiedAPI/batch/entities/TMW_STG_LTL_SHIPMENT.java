package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_LTL_SHIPMENT")
public class TMW_STG_LTL_SHIPMENT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="MBLNbr")
	private String mblNbr;
	
	@Column(name="MASTERSHIPMENTID")
	private String masterShipmentId;
	
	@Column(name="LTLLEGID")
	private String ltlLegId;
	
	@Column(name="FALLBACKTODEFAULTACCOUNTGROUP")
	private String fallbackToDefaultAccountGroup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMblNbr() {
		return mblNbr;
	}

	public void setMblNbr(String mblNbr) {
		this.mblNbr = mblNbr;
	}

	public String getMasterShipmentId() {
		return masterShipmentId;
	}

	public void setMasterShipmentId(String masterShipmentId) {
		this.masterShipmentId = masterShipmentId;
	}

	public String getLtlLegId() {
		return ltlLegId;
	}

	public void setLtlLegId(String ltlLegId) {
		this.ltlLegId = ltlLegId;
	}

	public String getFallbackToDefaultAccountGroup() {
		return fallbackToDefaultAccountGroup;
	}

	public void setFallbackToDefaultAccountGroup(String fallbackToDefaultAccountGroup) {
		this.fallbackToDefaultAccountGroup = fallbackToDefaultAccountGroup;
	}
	
	
}
