package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_STOP")
public class ROUTE_STOP {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
    
	@Column(name="STOP_ID")
	private String stopId;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="LOCATION_NAME")
    private String locationName;
	
	@Column(name="IDENTIFIER_TYPE")
    private String identifierType;
	
	@Column(name="IDENTIFIER_VALUE")
    private String identifierValue;
	
	@Column(name="LATITUDE")
    private String latitude;
	
	@Column(name="LONGITUDE")
    private String longitude;

    public int getId() {
		return id;
	}
	public String getRouteId() {
		return stopId;
	}
	public void setRouteId(String routeId) {
		this.stopId = routeId;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}  

}
