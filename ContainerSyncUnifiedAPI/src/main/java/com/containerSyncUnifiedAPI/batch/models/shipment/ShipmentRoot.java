package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentRoot {
    
	private String id;
	private List<ShipmentIdentifier> identifiers;
	private List<Attribute> attributes;
	private String shipmentShareLink;
	private RouteInfo routeInfo;
	private List<RelatedShipment> relatedShipments;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ShipmentIdentifier> getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(List<ShipmentIdentifier> identifiers) {
		this.identifiers = identifiers;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	public String getShipmentShareLink() {
		return shipmentShareLink;
	}
	public void setShipmentShareLink(String shipmentShareLink) {
		this.shipmentShareLink = shipmentShareLink;
	}
	public RouteInfo getRouteInfo() {
		return routeInfo;
	}
	public void setRouteInfo(RouteInfo routeInfo) {
		this.routeInfo = routeInfo;
	}
	public List<RelatedShipment> getRelatedShipments() {
		return relatedShipments;
	}
	public void setRelatedShipments(List<RelatedShipment> relatedShipments) {
		this.relatedShipments = relatedShipments;
	}
	
	
    
    
}