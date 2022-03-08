package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Position{
    public GeoCoordinates geoCoordinates;
    public String timeStamp;
    public int vesselNumber;
	public GeoCoordinates getGeoCoordinates() {
		return geoCoordinates;
	}
	public void setGeoCoordinates(GeoCoordinates geoCoordinates) {
		this.geoCoordinates = geoCoordinates;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getVesselNumber() {
		return vesselNumber;
	}
	public void setVesselNumber(int vesselNumber) {
		this.vesselNumber = vesselNumber;
	}
    
    
}