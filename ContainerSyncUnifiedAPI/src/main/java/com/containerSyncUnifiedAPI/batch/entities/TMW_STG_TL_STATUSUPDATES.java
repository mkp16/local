package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_TL_STATUSUPDATES")
public class TMW_STG_TL_STATUSUPDATES {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String MBOLNUMBER;
	private String STOPNUMBER;
	private String TIMESTAMP;
	private String STATUSCODE;
	private String STATUSREASONCODE;
	private String STATUSREASONDESC;
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
	public String getTIMESTAMP() {
		return TIMESTAMP;
	}
	public void setTIMESTAMP(String tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}
	public String getSTATUSCODE() {
		return STATUSCODE;
	}
	public void setSTATUSCODE(String sTATUSCODE) {
		STATUSCODE = sTATUSCODE;
	}
	public String getSTATUSREASONCODE() {
		return STATUSREASONCODE;
	}
	public void setSTATUSREASONCODE(String sTATUSREASONCODE) {
		STATUSREASONCODE = sTATUSREASONCODE;
	}
	public String getSTATUSREASONDESC() {
		return STATUSREASONDESC;
	}
	public void setSTATUSREASONDESC(String sTATUSREASONDESC) {
		STATUSREASONDESC = sTATUSREASONDESC;
	}
	
	


}
