package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppointmentWindow {

    private String startDateTime;
    private String endDateTime;
    private String localTimeZoneIdentifier;

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getLocalTimeZoneIdentifier() {
        return localTimeZoneIdentifier;
    }

    public void setLocalTimeZoneIdentifier(String localTimeZoneIdentifier) {
        this.localTimeZoneIdentifier = localTimeZoneIdentifier;
    }
}
