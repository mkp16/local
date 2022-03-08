package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingDetail {
    private boolean multipleDrivers;
    private TruckDetail truckDetails;
    private HazmatDetail hazmatDetails;

    public boolean isMultipleDrivers() {
        return multipleDrivers;
    }

    public void setMultipleDrivers(boolean multipleDrivers) {
        this.multipleDrivers = multipleDrivers;
    }

    public TruckDetail getTruckDetails() {
        return truckDetails;
    }

    public void setTruckDetails(TruckDetail truckDetails) {
        this.truckDetails = truckDetails;
    }

    public HazmatDetail getHazmatDetails() {
        return hazmatDetails;
    }

    public void setHazmatDetails(HazmatDetail hazmatDetails) {
        this.hazmatDetails = hazmatDetails;
    }
}
