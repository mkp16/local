package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TRACKIT_VESSEL")
public class Tmw_trackit_stg_vessel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String SHIPMENTID;
    private String CONTAINER_NO;
    private String imo;
    private String mmsi;
    private String name;
    private String callSign;
    private String shipType;
    private String width;
    private String length;
    private String draught;
    private String lengthUnit;
    private String VESSELNUMBER;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getVESSELNUMBER() {
		return VESSELNUMBER;
	}
	public void setVESSELNUMBER(String vESSELNUMBER) {
		VESSELNUMBER = vESSELNUMBER;
	}
	public String getSHIPMENTID() {
		return SHIPMENTID;
	}
	public void setSHIPMENTID(String sHIPMENTID) {
		SHIPMENTID = sHIPMENTID;
	}
	public String getCONTAINER_NO() {
		return CONTAINER_NO;
	}
	public void setCONTAINER_NO(String cONTAINER_NO) {
		CONTAINER_NO = cONTAINER_NO;
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
