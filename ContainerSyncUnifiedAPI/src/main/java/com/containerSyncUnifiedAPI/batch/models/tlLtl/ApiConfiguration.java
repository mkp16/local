package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiConfiguration {

    private boolean fallBackToDefaultAccountGroup;

    public boolean isFallBackToDefaultAccountGroup() {
        return fallBackToDefaultAccountGroup;
    }

    public void setFallBackToDefaultAccountGroup(boolean fallBackToDefaultAccountGroup) {
        this.fallBackToDefaultAccountGroup = fallBackToDefaultAccountGroup;
    }
}
