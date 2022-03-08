package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_PO_CONTAINER_STOPS")
public class TMW_STG_PO_CONTAINER_STOPS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STOPID")
    public String STOPID;
    
    @Column(name = "PONUMBER")
    public String PONUMBER;
    
    @Column(name = "CONTAINER_NO")
    public String CONTAINER_NO;
    

    @Column(name = "STOPNUMBER")
    public String STOPNUMBER;

    @Column(name = "STOPNAME")
    public String STOPNAME;

    @Column(name = "STOPTYPE")
    public String STOPTYPE;

    @Column(name = "PORTLOCODE")
    public String PORTLOCODE;

    @Column(name = "POSTAL_CODE")
    public String POSTAL_CODE;

    @Column(name = "ADDRESSLINE1")
    public String ADDRESSLINE1;

    @Column(name = "ADDRESSLINE2")
    public String ADDRESSLINE2;

    @Column(name = "ADDRESSLINE3")
    public String ADDRESSLINE3;

    @Column(name = "CITY")
    public String CITY;

    @Column(name = "STATE")
    public String STATE;

    @Column(name = "COUNTRY")
    public String COUNTRY;

    @Column(name = "LONGITUDE")
    public String LONGITUDE;

    @Column(name = "LATITUDE")
    public String LATITUDE;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSTOPID() {
        return STOPID;
    }

    public void setSTOPID(String STOPID) {
        this.STOPID = STOPID;
    }

    public String getSTOPNUMBER() {
        return STOPNUMBER;
    }

    public void setSTOPNUMBER(String STOPNUMBER) {
        this.STOPNUMBER = STOPNUMBER;
    }

    public String getSTOPNAME() {
        return STOPNAME;
    }

    public void setSTOPNAME(String STOPNAME) {
        this.STOPNAME = STOPNAME;
    }

    public String getSTOPTYPE() {
        return STOPTYPE;
    }

    public void setSTOPTYPE(String STOPTYPE) {
        this.STOPTYPE = STOPTYPE;
    }

    public String getPORTLOCODE() {
        return PORTLOCODE;
    }

    public void setPORTLOCODE(String PORTLOCODE) {
        this.PORTLOCODE = PORTLOCODE;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getADDRESSLINE1() {
        return ADDRESSLINE1;
    }

    public void setADDRESSLINE1(String ADDRESSLINE1) {
        this.ADDRESSLINE1 = ADDRESSLINE1;
    }

    public String getADDRESSLINE2() {
        return ADDRESSLINE2;
    }

    public void setADDRESSLINE2(String ADDRESSLINE2) {
        this.ADDRESSLINE2 = ADDRESSLINE2;
    }

    public String getADDRESSLINE3() {
        return ADDRESSLINE3;
    }

    public void setADDRESSLINE3(String ADDRESSLINE3) {
        this.ADDRESSLINE3 = ADDRESSLINE3;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

	public String getCONTAINER_NO() {
		return CONTAINER_NO;
	}

	public void setCONTAINER_NO(String cONTAINER_NO) {
		CONTAINER_NO = cONTAINER_NO;
	}

	public String getPONUMBER() {
		return PONUMBER;
	}

	public void setPONUMBER(String pONUMBER) {
		PONUMBER = pONUMBER;
	}
    
	
    
}
