package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackedShipment{
    public String shipmentId;
    public String mapUrl;
    public String masterShipmentId;
    public String oceanLegId;
    public List<ShipmentIdentifier> shipmentIdentifiers;
    public EquipmentIdentifier equipmentIdentifier;
    public List<Attribute> attributes;
    public String carrierSCACCode;
    public ContainerDetails containerDetails;
    public List<Stop> stops;
    public List<Vessel> vessels;
    public List<State> states;
    public List<Event> events;
    public List<Position> positions;
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getMapUrl() {
		return mapUrl;
	}
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}
	public String getMasterShipmentId() {
		return masterShipmentId;
	}
	public void setMasterShipmentId(String masterShipmentId) {
		this.masterShipmentId = masterShipmentId;
	}
	public String getOceanLegId() {
		return oceanLegId;
	}
	public void setOceanLegId(String oceanLegId) {
		this.oceanLegId = oceanLegId;
	}
	public List<ShipmentIdentifier> getShipmentIdentifiers() {
		return shipmentIdentifiers;
	}
	public void setShipmentIdentifiers(List<ShipmentIdentifier> shipmentIdentifiers) {
		this.shipmentIdentifiers = shipmentIdentifiers;
	}
	public EquipmentIdentifier getEquipmentIdentifier() {
		return equipmentIdentifier;
	}
	public void setEquipmentIdentifier(EquipmentIdentifier equipmentIdentifier) {
		this.equipmentIdentifier = equipmentIdentifier;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	public String getCarrierSCACCode() {
		return carrierSCACCode;
	}
	public void setCarrierSCACCode(String carrierSCACCode) {
		this.carrierSCACCode = carrierSCACCode;
	}
	public ContainerDetails getContainerDetails() {
		return containerDetails;
	}
	public void setContainerDetails(ContainerDetails containerDetails) {
		this.containerDetails = containerDetails;
	}
	public List<Stop> getStops() {
		return stops;
	}
	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}
	public List<Vessel> getVessels() {
		return vessels;
	}
	public void setVessels(List<Vessel> vessels) {
		this.vessels = vessels;
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
    
    
}
