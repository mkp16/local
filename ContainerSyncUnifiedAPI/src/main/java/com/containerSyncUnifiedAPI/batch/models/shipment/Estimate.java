package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Estimate{
    public EstimatedTimeWindow estimatedTimeWindow;
    public String timelinessCode;
    public String lastCalculatedDateTime;
	public EstimatedTimeWindow getEstimatedTimeWindow() {
		return estimatedTimeWindow;
	}
	public void setEstimatedTimeWindow(EstimatedTimeWindow estimatedTimeWindow) {
		this.estimatedTimeWindow = estimatedTimeWindow;
	}
	public String getTimelinessCode() {
		return timelinessCode;
	}
	public void setTimelinessCode(String timelinessCode) {
		this.timelinessCode = timelinessCode;
	}
	public String getLastCalculatedDateTime() {
		return lastCalculatedDateTime;
	}
	public void setLastCalculatedDateTime(String lastCalculatedDateTime) {
		this.lastCalculatedDateTime = lastCalculatedDateTime;
	}
    
    
}
