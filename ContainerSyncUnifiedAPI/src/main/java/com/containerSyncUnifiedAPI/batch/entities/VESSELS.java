package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TRACKED_VESSELS")
public class VESSELS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="SHIPMENT_ID")
	private String shipmentId;
	
	@Column(name="VESSELNUMBER")
	private String vesselNumber;
	
	@Column(name="IMO")
	private String imo;
	
	@Column(name="MMSI")
	private String mmsi;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CALLSIGN")
	private String callSign;
	
	@Column(name="SHIPTYPE")
	private String shipType;
	
	@Column(name="WIDTH")
	private String width;
	
	@Column(name="LENGTH")
	private String length;
	
	@Column(name="DRAUGHT")
	private String draught;
	
	@Column(name="LENGTHUNIT")
	private String lengthUnit;

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

	public String getVesselNumber() {
		return vesselNumber;
	}

	public void setVesselNumber(String vesselNumber) {
		this.vesselNumber = vesselNumber;
	}

	public String getImo() {
		return imo;
	}

	public void setImo(String imo) {
		this.imo = imo;
	}

	public String getMmsi() {
		return mmsi;
	}

	public void setMmsi(String mmsi) {
		this.mmsi = mmsi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public String getShipType() {
		return shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getDraught() {
		return draught;
	}

	public void setDraught(String draught) {
		this.draught = draught;
	}

	public String getLengthUnit() {
		return lengthUnit;
	}

	public void setLengthUnit(String lengthUnit) {
		this.lengthUnit = lengthUnit;
	}

}