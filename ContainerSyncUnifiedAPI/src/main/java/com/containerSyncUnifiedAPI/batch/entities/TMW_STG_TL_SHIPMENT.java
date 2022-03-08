package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TL_SHIPMENT")
public class TMW_STG_TL_SHIPMENT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="MBLNbr")
	private String mblNbr;
    
    @Column(name="CARRIERTYPE")
	private String carrierType;
    
    @Column(name="CARRIERVALUE")
	private String carrierValue;
    
    @Column(name="SENSORS")
	private String sensors;
    
    @Column(name="FALLBACKTODEFAULTACCOUNTGROUP")
	private boolean fallBackToDefaultAccountGroup;
    
    @Column(name="TRACKINGTYPE")
	private String trackingType;
    
    @Column(name="LATESTTIMESTAMP")
	private String latestTimestamp;
    
    @Column(name="LATESTSTATUSCODE")
	private String latestStatusCode;
    
    @Column(name="LATESTSTATUSREASONCODE")
	private String latestStatusReasonCode;
    
    @Column(name="LATESTSTATUSCODEDESC")
	private String latestStatusCodeDesc;
    
    @Column(name="LATESTSTOPSTOPNUMBER")
	private String latestStopStopNumber;
    
    @Column(name="LATESTSTOPSTATUSCODE")
	private String latestStopStatusCode;
    
    @Column(name="LATESTSTOPARRIVALCODE")
	private String latestStopArrivalCode;
    
    @Column(name="ADD_APPOINTMENT_WINDOW_STATUSES")
	private String addAppointmentWindowStatuses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMblNbr() {
		return mblNbr;
	}

	public void setMblNbr(String mblNbr) {
		this.mblNbr = mblNbr;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}

	public String getCarrierValue() {
		return carrierValue;
	}

	public void setCarrierValue(String carrierValue) {
		this.carrierValue = carrierValue;
	}

	public String getSensors() {
		return sensors;
	}

	public void setSensors(String sensors) {
		this.sensors = sensors;
	}

	public boolean getFallBackToDefaultAccountGroup() {
		return fallBackToDefaultAccountGroup;
	}

	public void setFallBackToDefaultAccountGroup(boolean fallBackToDefaultAccountGroup) {
		this.fallBackToDefaultAccountGroup = fallBackToDefaultAccountGroup;
	}

	public String getTrackingType() {
		return trackingType;
	}

	public void setTrackingType(String trackingType) {
		this.trackingType = trackingType;
	}

	public String getLatestTimestamp() {
		return latestTimestamp;
	}

	public void setLatestTimestamp(String latestTimestamp) {
		this.latestTimestamp = latestTimestamp;
	}

	public String getLatestStatusCode() {
		return latestStatusCode;
	}

	public void setLatestStatusCode(String latestStatusCode) {
		this.latestStatusCode = latestStatusCode;
	}

	public String getLatestStatusReasonCode() {
		return latestStatusReasonCode;
	}

	public void setLatestStatusReasonCode(String latestStatusReasonCode) {
		this.latestStatusReasonCode = latestStatusReasonCode;
	}

	public String getLatestStatusCodeDesc() {
		return latestStatusCodeDesc;
	}

	public void setLatestStatusCodeDesc(String latestStatusCodeDesc) {
		this.latestStatusCodeDesc = latestStatusCodeDesc;
	}

	public String getLatestStopStopNumber() {
		return latestStopStopNumber;
	}

	public void setLatestStopNumber(String latestStopStopNumber) {
		this.latestStopStopNumber = latestStopStopNumber;
	}

	public String getLatestStopStatusCode() {
		return latestStopStatusCode;
	}

	public void setLatestStopStatusCode(String latestStopStatusCode) {
		this.latestStopStatusCode = latestStopStatusCode;
	}

	public String getLatestStopArrivalCode() {
		return latestStopArrivalCode;
	}

	public void setLatestStopArrivalCode(String latestStopArrivalCode) {
		this.latestStopArrivalCode = latestStopArrivalCode;
	}

	public String getAddAppointmentWindowStatuses() {
		return addAppointmentWindowStatuses;
	}

	public void setAddAppointmentWindowStatuses(String addAppointmentWindowStatuses) {
		this.addAppointmentWindowStatuses = addAppointmentWindowStatuses;
	}    

}
