package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW")
public class TMW_STG_TL_SHIPMENT_STOP_APPT_WINDOW {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="STOP_ID")
	private String stopId;
    
    @Column(name="BOL_NUMBER")
	private String bolnumber;
       
    @Column(name="STARTDATETIME")
	private String startDateTime;
    
    @Column(name="ENDDATETIME")
	private String endDateTime;
    
    @Column(name="LOCALTIMEZONEIDENTIFIER")
	private String localTimeZoneIDentifier;
    
   
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStopId() {
		return stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

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

	public String getLocalTimeZoneIDentifier() {
		return localTimeZoneIDentifier;
	}

	public void setLocalTimeZoneIDentifier(String localTimeZoneIDentifier) {
		this.localTimeZoneIDentifier = localTimeZoneIDentifier;
	}

	public String getBolnumber() {
		return bolnumber;
	}

	public void setBolnumber(String bolnumber) {
		this.bolnumber = bolnumber;
	}
	
	
   
}
