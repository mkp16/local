package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_LTL_LATEST_STATUS")
public class TMW_STG_LTL_LATEST_STATUS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="MBLNbr")
	private String mblNbr;
	
	@Column(name="DATE")
	private String date;
	
	@Column(name="TIME")
	private String time;
	
	@Column(name="TIMEZONEOFFSET")
	private String timeZoneOffSet;
	
	@Column(name="RETRIEVALDATETIME")
	private String retrievalDateTime;
	
	@Column(name="STATUSCODE")
	private String statusCode;
	
	@Column(name="STATUSREASONCODE")
	private String statusReasonCode;

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTimeZoneOffSet() {
		return timeZoneOffSet;
	}

	public void setTimeZoneOffSet(String timeZoneOffSet) {
		this.timeZoneOffSet = timeZoneOffSet;
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

	public String getStatusReasonCode() {
		return statusReasonCode;
	}

	public void setStatusReasonCode(String statusReasonCode) {
		this.statusReasonCode = statusReasonCode;
	}

}