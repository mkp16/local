package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TL_SHIPMENT_DTL")
public class TMW_STG_TL_SHIPMENT_DTL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="MBLNbr")
	private String mblNbr;
    
    @Column(name="MULTIPLEDRIVERS")
	private String multipleDrivers;
    
    @Column(name="TRUCKLENGTH")
	private String truckLength;
    
    @Column(name="HAZMATDETAILS")
	private String hazmatDetails;
    
    @Column(name="TRUCKWEIGHT")
	private String truckWeight;
    
    @Column(name="TRUCKHEIGHT")
	private String truckHeight;    

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

	public String getMultipleDrivers() {
		return multipleDrivers;
	}

	public void setMultipleDrivers(String multipleDrivers) {
		this.multipleDrivers = multipleDrivers;
	}

	public String getTruckLength() {
		return truckLength;
	}

	public void setTruckLength(String truckLength) {
		this.truckLength = truckLength;
	}

	public String getHazmatDetails() {
		return hazmatDetails;
	}

	public void setHazmatDetails(String hazmatDetails) {
		this.hazmatDetails = hazmatDetails;
	}

	public String getTruckWeight() {
		return truckWeight;
	}

	public void setTruckWeight(String truckWeight) {
		this.truckWeight = truckWeight;
	}

	public String getTruckHeight() {
		return truckHeight;
	}

	public void setTruckHeight(String truckHeight) {
		this.truckHeight = truckHeight;
	}
	

}
