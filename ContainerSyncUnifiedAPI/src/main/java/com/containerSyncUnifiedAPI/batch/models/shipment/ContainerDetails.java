package com.containerSyncUnifiedAPI.batch.models.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContainerDetails{
    public String containerId;
    public String demurrage;
    public String currency;
    public String lastFreeDay;
	public String getContainerId() {
		return containerId;
	}
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	public String getDemurrage() {
		return demurrage;
	}
	public void setDemurrage(String demurrage) {
		this.demurrage = demurrage;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getLastFreeDay() {
		return lastFreeDay;
	}
	public void setLastFreeDay(String lastFreeDay) {
		this.lastFreeDay = lastFreeDay;
	}
    
    
}