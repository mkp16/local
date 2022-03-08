package com.containerSyncUnifiedAPI.batch.models.po;

import java.util.List;

public class RouteSegments {

	private String  id;
	private String transportationMode;
	private List<String> identifiers;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTransportationMode() {
		return transportationMode;
	}
	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
	}
	public List<String> getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(List<String> identifiers) {
		this.identifiers = identifiers;
	}
	
	
	
}
