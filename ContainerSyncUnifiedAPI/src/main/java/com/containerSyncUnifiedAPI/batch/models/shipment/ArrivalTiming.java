package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrivalTiming{
    public Estimate estimate;
    public Actual actual;
    public Scheduled scheduled;
	public Estimate getEstimate() {
		return estimate;
	}
	public void setEstimate(Estimate estimate) {
		this.estimate = estimate;
	}
	public Actual getActual() {
		return actual;
	}
	public void setActual(Actual actual) {
		this.actual = actual;
	}
	public Scheduled getScheduled() {
		return scheduled;
	}
	public void setScheduled(Scheduled scheduled) {
		this.scheduled = scheduled;
	}
    
    
}