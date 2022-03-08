package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestStopStatuses {

    private String stopNumber;
    private String statusCode;
    private String arrivalCode;
    private List<AdditionalAppointmentWindowStatus>  additionalAppointmentWindowStatuses;
    private String stopType;
    private long stopId;

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public long getStopId() {
        return stopId;
    }

    public void setStopId(long stopId) {
        this.stopId = stopId;
    }

    public String getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(String stopNumber) {
        this.stopNumber = stopNumber;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public List<AdditionalAppointmentWindowStatus> getAdditionalAppointmentWindowStatuses() {
        return additionalAppointmentWindowStatuses;
    }

    public void setAdditionalAppointmentWindowStatuses(List<AdditionalAppointmentWindowStatus> additionalAppointmentWindowStatuses) {
        this.additionalAppointmentWindowStatuses = additionalAppointmentWindowStatuses;
    }
}
