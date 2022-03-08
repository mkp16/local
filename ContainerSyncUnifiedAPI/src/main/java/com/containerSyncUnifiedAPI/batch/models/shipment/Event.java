package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event{
	 private String  dateTime;
      private String type;
      private String stopId;
      private String  routeSegmentId;
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