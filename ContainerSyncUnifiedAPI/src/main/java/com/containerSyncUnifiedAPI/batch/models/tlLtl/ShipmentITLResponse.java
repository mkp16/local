package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentITLResponse {

    private Shipment shipment;
    private LatestStatusUpdate latestStatusUpdate;
    private List<LatestStopStatuses> latestStopStatuses;
    private List<InfoMessages> infoMessages;


    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public List<InfoMessages> getInfoMessages() {
        return infoMessages;
    }

    public void setInfoMessages(List<InfoMessages> infoMessages) {
        this.infoMessages = infoMessages;
    }

    public List<LatestStopStatuses> getLatestStopStatuses() {
        return latestStopStatuses;
    }

    public void setLatestStopStatuses(List<LatestStopStatuses> latestStopStatuses) {
        this.latestStopStatuses = latestStopStatuses;
    }

    public LatestStatusUpdate getLatestStatusUpdate() {
        return latestStatusUpdate;
    }

    public void setLatestStatusUpdate(LatestStatusUpdate latestStatusUpdate) {
        this.latestStatusUpdate = latestStatusUpdate;
    }
}
