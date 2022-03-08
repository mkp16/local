package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentTLResponse {

    private Shipment shipment;
    private LatestStatusUpdate latestStatusUpdate;
    private List<StatusUpdates> statusUpdates;
    private List<SensorHistories> sensorHistories;
    private List<LatestStopStatuses> latestStopStatuses;
    private List<InfoMessages> infoMessages;

    

    public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}

	public LatestStatusUpdate getLatestStatusUpdate() {
        return latestStatusUpdate;
    }

    public void setLatestStatusUpdate(LatestStatusUpdate latestStatusUpdate) {
        this.latestStatusUpdate = latestStatusUpdate;
    }

    public List<StatusUpdates> getStatusUpdates() {
        return statusUpdates;
    }

    public void setStatusUpdates(List<StatusUpdates> statusUpdates) {
        this.statusUpdates = statusUpdates;
    }

    public List<SensorHistories> getSensorHistories() {
        return sensorHistories;
    }

    public void setSensorHistories(List<SensorHistories> sensorHistories) {
        this.sensorHistories = sensorHistories;
    }

    public List<LatestStopStatuses> getLatestStopStatuses() {
        return latestStopStatuses;
    }

    public void setLatestStopStatuses(List<LatestStopStatuses> latestStopStatuses) {
        this.latestStopStatuses = latestStopStatuses;
    }

    public List<InfoMessages> getInfoMessages() {
        return infoMessages;
    }

    public void setInfoMessages(List<InfoMessages> infoMessages) {
        this.infoMessages = infoMessages;
    }
}
