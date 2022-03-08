package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_EVENTS")
public class EVENT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="DATETIME")
	private String dateTime;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="STOP_ID")
	private String stopId;
	
	@Column(name="ROUTE_SEGMENT_ID")
	private String routeSegmentId;

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

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getRouteSegmentId() {
		return routeSegmentId;
	}

	public void setRouteSegmentId(String routeSegmentId) {
		this.routeSegmentId = routeSegmentId;
	}
	
	
}
