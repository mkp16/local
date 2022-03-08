package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteInfo {
	
	private List<Stop> stops;
	private List<RouteSegment> routeSegments;
	
	public List<RouteSegment> getRouteSegments() {
		return routeSegments;
	}
	public void setRouteSegments(List<RouteSegment> routeSegments) {
		this.routeSegments = routeSegments;
	}
	public List<Stop> getStops() {
		return stops;
	}
	public void setStops(List<Stop> stops) {
		this.stops = stops;
	}
	
	

}
