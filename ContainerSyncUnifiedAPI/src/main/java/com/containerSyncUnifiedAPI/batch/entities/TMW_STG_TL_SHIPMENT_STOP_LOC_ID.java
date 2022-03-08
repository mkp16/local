package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TL_SHIPMENT_STOP_LOC_ID")
public class TMW_STG_TL_SHIPMENT_STOP_LOC_ID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="STOP_ID")
	private String stopId;
       
    @Column(name="TYPE")
	private String type;
    
    @Column(name="BOL_NUMBER")
   	private String bolnumber;
    
    
    @Column(name="VALUE")
	private String value;
    
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getBolnumber() {
		return bolnumber;
	}

	public void setBolnumber(String bolnumber) {
		this.bolnumber = bolnumber;
	}
	
	
   
}
