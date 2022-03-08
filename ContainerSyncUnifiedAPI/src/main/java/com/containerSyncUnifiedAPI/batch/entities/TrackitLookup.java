package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TMW_TRACKIT_LOOKUP_MANNU")
public class TrackitLookup {

    @Id
    private Long id;

    private String PROPERTY;
    private String VALUE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPROPERTY() {
        return PROPERTY;
    }

    public void setPROPERTY(String pROPERTY) {
        PROPERTY = pROPERTY;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String vALUE) {
        VALUE = vALUE;
    }
}
