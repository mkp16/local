package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_STATES")
public class States {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="STATECODE")
	private String stateCode;
	
	@Column(name="STARTTIME")
	private String startTime;
	
	@Column(name="ENDTIME")
	private String endTime;
	
	@Column(name="STOPNUMBER")
	private String stopNumber;
	
	@Column(name="VESSELNUMBER")
	private String vesselNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
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
