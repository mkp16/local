package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_LTL_SHIPMENT_STOP")
public class TMW_STG_LTL_SHIPMENT_STOP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="MBLNbr")
	private String mblNbr;
    
    @Column(name="STOPID")
	private String stopId;
    
    @Column(name="STOPTYPE")
	private String stopType;
    
    @Column(name="STOPNUMBER")
	private String stopNumber;
    
    @Column(name="APPSTARTDATETIME")
	private String appStartDateTime;
    
    @Column(name="APPENDDATETIME")
	private String appEndDateTime;
    
    @Column(name="APPLOCALTIMEZONEIDENTIFIER")
	private String appLocalTimezoneIdentifier;
    
    @Column(name="LOCPOSTALCODE")
	private String locPostalCode;
    
    @Column(name="LOCADDRESSLINE1")
	private String locAddresLine1;
    
    @Column(name="LOCADDRESSLINE2")
	private String locAddresLine2;
    
    @Column(name="LOCADDRESSLINE3")
	private String locAddresLine3;
    
    @Column(name="LOCCITY")
	private String locCity;
    
    @Column(name="LOCSTATE")
	private String locState;
    
    @Column(name="LOCCOUNTRY")
	private String locCountry;
    
    @Column(name="LOCCOMPANYNAME")
	private String locCompanyName;
    
    @Column(name="LOCPHONENUMBER")
	private String locPhoneNumber;
    
    @Column(name="STOPNAME")
	private String stopName;
    
    @Column(name="LATITUDE")
	private String latitude;
    
    @Column(name="LONGITUDE")
	private String longitude;
    
    @Column(name="UUID")
	private String uuid;
    
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

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public String getStopNumber() {
		return stopNumber;
	}

	public void setStopNumber(String stopNumber) {
		this.stopNumber = stopNumber;
	}

	public String getAppStartDateTime() {
		return appStartDateTime;
	}

	public void setAppStartDateTime(String appStartDateTime) {
		this.appStartDateTime = appStartDateTime;
	}

	public String getAppEndDateTime() {
		return appEndDateTime;
	}

	public void setAppEndDateTime(String appEndDateTime) {
		this.appEndDateTime = appEndDateTime;
	}

	public String getAppLocalTimezoneIdentifier() {
		return appLocalTimezoneIdentifier;
	}

	public void setAppLocalTimezoneIdentifier(String appLocalTimezoneIdentifier) {
		this.appLocalTimezoneIdentifier = appLocalTimezoneIdentifier;
	}

	public String getLocPostalCode() {
		return locPostalCode;
	}

	public void setLocPostalCode(String locPostalCode) {
		this.locPostalCode = locPostalCode;
	}

	public String getLocAddresLine1() {
		return locAddresLine1;
	}

	public void setLocAddresLine1(String locAddresLine1) {
		this.locAddresLine1 = locAddresLine1;
	}

	public String getLocAddresLine2() {
		return locAddresLine2;
	}

	public void setLocAddresLine2(String locAddresLine2) {
		this.locAddresLine2 = locAddresLine2;
	}

	public String getLocAddresLine3() {
		return locAddresLine3;
	}

	public void setLocAddresLine3(String locAddresLine3) {
		this.locAddresLine3 = locAddresLine3;
	}

	public String getLocCity() {
		return locCity;
	}

	public void setLocCity(String locCity) {
		this.locCity = locCity;
	}

	public String getLocState() {
		return locState;
	}

	public void setLocState(String locState) {
		this.locState = locState;
	}

	public String getLocCountry() {
		return locCountry;
	}

	public void setLocCountry(String locCountry) {
		this.locCountry = locCountry;
	}

	public String getLocCompanyName() {
		return locCompanyName;
	}

	public void setLocCompanyName(String locCompanyName) {
		this.locCompanyName = locCompanyName;
	}

	public String getLocPhoneNumber() {
		return locPhoneNumber;
	}

	public void setLocPhoneNumber(String locPhoneNumber) {
		this.locPhoneNumber = locPhoneNumber;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	   
}
