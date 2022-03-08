package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TL_STOP_STATUS")
public class TMW_STG_TL_STOP_STATUS {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String MBOLNUMBER;
	private String STOPNUMBER;
	private String STATUSCODE;
	private String ARRIVALCODE;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMBOLNUMBER() {
		return MBOLNUMBER;
	}
	public void setMBOLNUMBER(String mBOLNUMBER) {
		MBOLNUMBER = mBOLNUMBER;
	}
	public String getSTOPNUMBER() {
		return STOPNUMBER;
	}
	public void setSTOPNUMBER(String sTOPNUMBER) {
		STOPNUMBER = sTOPNUMBER;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public String getARRIVALCODE() {
		return ARRIVALCODE;
	}
	public void setARRIVALCODE(String aRRIVALCODE) {
		ARRIVALCODE = aRRIVALCODE;
	}
	
	


}
