package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LatestStatusUpdate {
    private String timestamp;
    private String retrievalDateTime;
    private String statusCode;
    private StatusReason statusReason;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRetrievalDateTime() {
        return retrievalDateTime;
    }

    public void setRetrievalDateTime(String retrievalDateTime) {
        this.retrievalDateTime = retrievalDateTime;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public StatusReason getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(StatusReason statusReason) {
        this.statusReason = statusReason;
    }
}
