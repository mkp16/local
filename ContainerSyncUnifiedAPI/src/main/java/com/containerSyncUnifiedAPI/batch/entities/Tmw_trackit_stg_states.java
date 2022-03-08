package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name = "TMW_STG_TRACKIT_STATES")
public class Tmw_trackit_stg_states {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CONTAINER_NO;
    private String SHIPMENTID;
    private String stateCode;
    private String startTime;
    private String endTime;
    private String stopNumber;
    private String vesselNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCONTAINER_NO() {
		return CONTAINER_NO;
	}
	public void setCONTAINER_NO(String cONTAINER_NO) {
		CONTAINER_NO = cONTAINER_NO;
	}
	public String getSHIPMENTID() {
		return SHIPMENTID;
	}
	public void setSHIPMENTID(String sHIPMENTID) {
		SHIPMENTID = sHIPMENTID;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStopNumber() {
		return stopNumber;
	}
	public void setStopNumber(String stopNumber) {
		this.stopNumber = stopNumber;
	}
	public String getVesselNumber() {
		return vesselNumber;
	}
	public void setVesselNumber(String vesselNumber) {
		this.vesselNumber = vesselNumber;
	}

   
}
