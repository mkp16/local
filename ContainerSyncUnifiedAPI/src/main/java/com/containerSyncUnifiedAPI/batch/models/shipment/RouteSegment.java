package com.containerSyncUnifiedAPI.batch.models.shipment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteSegment {

	
	
        private String id;
        private String fromStopId;
        private String toStopId;
        private String transportationMode;
        private List<Identifier> identifiers;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getFromStopId() {
			return fromStopId;
		}
		public void setFromStopId(String fromStopId) {
			this.fromStopId = fromStopId;
		}
		public String getToStopId() {
			return toStopId;
		}
		public void setToStopId(String toStopId) {
			this.toStopId = toStopId;
		}
		public String getTransportationMode() {
			return transportationMode;
		}
		public void setTransportationMode(String transportationMode) {
			this.transportationMode = transportationMode;
		}
		public List<Identifier> getIdentifiers() {
			return identifiers;
		}
		public void setIdentifiers(List<Identifier> identifiers) {
			this.identifiers = identifiers;
		}
        
        
        
        
	
}
