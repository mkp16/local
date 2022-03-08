package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SORoot{
    
	private ShipmentRoot shipment;
	private List<State> states;
    private List<Event> events; 
    private List<Position> positions;
    private List<Vessel> vessels;
	public ShipmentRoot getShipment() {
		return shipment;
	}
	public void setShipment(ShipmentRoot shipment) {
		this.shipment = shipment;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public List<Vessel> getVessels() {
		return vessels;
	}
	public void setVessels(List<Vessel> vessels) {
		this.vessels = vessels;
	}
    
}