package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_ROUTESEGMENT")
public class ROUTE_SEGMENT {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ROUTESEGMENT_ID")
	private String routeSegmentId;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="FROMSTOP_ID")
	private String fromStopId;
	
	@Column(name="TOSTOP_ID")
	private String toStopId;
	
	@Column(name="TRANSPORTATION_MODE")
	private String transportationMode;
	
	@Column(name="IDENTIFIER_TYPE")
	private String identifierType;
	
	@Column(name="IDENTIFIER_VALUE")
	private String identifierValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRouteSegmentId() {
		return routeSegmentId;
	}

	public void setRouteSegmentId(String routeSegmentId) {
		this.routeSegmentId = routeSegmentId;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getFromStopId() {
		return fromStopId;
	}

	public void setFromStopId(String fromStopId) {
		this.fromStopId = fromStopId;
	}

	public String getToStopId() {
		return toStopId;
	}

	public void setToStopId(String toStopId) {
		this.toStopId = toStopId;
	}

	public String getTransportationMode() {
		return transportationMode;
	}

	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
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
