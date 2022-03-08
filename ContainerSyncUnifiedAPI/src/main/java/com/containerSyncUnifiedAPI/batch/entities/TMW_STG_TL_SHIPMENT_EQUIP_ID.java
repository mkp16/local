package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_TL_SHIPMENT_EQUIP_ID")
public class TMW_STG_TL_SHIPMENT_EQUIP_ID {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="MBLNbr")
	private String mblNbr;
    
    @Column(name="VALUE")
	private String carrierValue;
    
    @Column(name="TYPE")
	private String type;

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

	public String getCarrierValue() {
		return carrierValue;
	}

	public void setCarrierValue(String carrierValue) {
		this.carrierValue = carrierValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
