package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_RELATEDSHIPMENTS")
public class RELATED_SHIPMENT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="RELATED_SHIPMENT_ID")
	private String relatedShipmentId;
	
	@Column(name="TYPE")
	private String identifierType;
	
	@Column(name="VALUE")
	private String identifierValue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getRelatedShipmentId() {
		return relatedShipmentId;
	}
	public void setRelatedShipmentId(String relatedShipmentId) {
		this.relatedShipmentId = relatedShipmentId;
	}
	public String getIdentifierType() {
		return identifierType;
	}
	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}
	public String getIdentifierValue() {
		return identifierValue;
	}
	public void setIdentifierValue(String identifierValue) {
		this.identifierValue = identifierValue;
	}
	

}
