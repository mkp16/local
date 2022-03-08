package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TruckDetail {
    private TruckDimension truckDimensions;

    public TruckDimension getTruckDimensions() {
        return truckDimensions;
    }

    public void setTruckDimensions(TruckDimension truckDimensions) {
        this.truckDimensions = truckDimensions;
    }
}
