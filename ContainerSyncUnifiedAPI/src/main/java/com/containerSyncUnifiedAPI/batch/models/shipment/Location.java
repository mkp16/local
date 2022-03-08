package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	
	private String name;
    private List<Identifier> identifiers;
    private GeoCoordinates coordinates;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Identifier> getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}
	public GeoCoordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(GeoCoordinates coordinates) {
		this.coordinates = coordinates;
	}
    

}
