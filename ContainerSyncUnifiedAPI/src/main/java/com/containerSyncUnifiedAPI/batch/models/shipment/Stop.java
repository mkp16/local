package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop{
    public String id;
    public int stopNumber;
    public String name;
    public String stopType;
    public String portLocode;
    public String portCBPCode;
    public ContAddress address;
    public GeoCoordinates geoCoordinates;
    public ArrivalTiming arrivalTiming;
    public DepartureTiming departureTiming;
    private Location location;
    private String type;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStopNumber() {
		return stopNumber;
	}
	public void setStopNumber(int stopNumber) {
		this.stopNumber = stopNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStopType() {
		return stopType;
	}
	public void setStopType(String stopType) {
		this.stopType = stopType;
	}
	public String getPortLocode() {
		return portLocode;
	}
	public void setPortLocode(String portLocode) {
		this.portLocode = portLocode;
	}
	public String getPortCBPCode() {
		return portCBPCode;
	}
	public void setPortCBPCode(String portCBPCode) {
		this.portCBPCode = portCBPCode;
	}
	public ContAddress getAddress() {
		return address;
	}
	public void setAddress(ContAddress address) {
		this.address = address;
	}
	public GeoCoordinates getGeoCoordinates() {
		return geoCoordinates;
	}
	public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
		this.geoCoordinates = geoCoordinates;
	}
	public ArrivalTiming getArrivalTiming() {
		return arrivalTiming;
	}
	public void setArrivalTiming(ArrivalTiming arrivalTiming) {
		this.arrivalTiming = arrivalTiming;
	}
	public DepartureTiming getDepartureTiming() {
		return departureTiming;
	}
	public void setDepartureTiming(DepartureTiming departureTiming) {
		this.departureTiming = departureTiming;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
    
    
}