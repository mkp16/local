package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TMW_STG_TRACKED_SHIPMENT_INFO")
public class SHIPMENT_INFO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="SHIPMENT_SHARE_LINK")
	private String shipmentShareLink;
	
	@Column(name = "ORDER_NUMBER_UV")
	private String orderNumber;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentShareLink() {
		return shipmentShareLink;
	}
	public void setShipmentShareLink(String shipmentShareLink) {
		this.shipmentShareLink = shipmentShareLink;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
}
