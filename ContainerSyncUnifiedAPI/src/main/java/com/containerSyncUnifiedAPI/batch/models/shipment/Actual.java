package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Actual{
    public String dateTime;
    public String timelinessCode;
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getTimelinessCode() {
		return timelinessCode;
	}
	public void setTimelinessCode(String timelinessCode) {
		this.timelinessCode = timelinessCode;
	}
    
    
}
