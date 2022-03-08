package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name = "TMW_STG_TRACKIT_DLVRY_TIMING")
public class Tmw_trackit_stg_dlvry_timing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String CONTAINER_NO;
    private String STOPNUMBER;
    private String ARR_EST_START_DATE_TIME;
    private String ARR_EST_END_DATE_TIME;
    private String ARR_TIMELINESCODE;
    private String ARR_LASTCALCULATEDDATETIME;
    private String ARR_ACT_START_DATETIME;
    private String ARR_ACT_TIMELINES_CODE;
    private String ARR_SCH_START_DATETIME;
    private String ARR_SCH_TIMELINES_CODE;
    private String DEP_EST_START_DATE_TIME;
    private String DEP_EST_END_DATE_TIME;
    private String DEP_TIMELINESCODE;
    private String DEP_LASTCALCULATEDDATETIME;
    private String DEP_ACT_START_DATETIME;
    private String DEP_ACT_TIMELINES_CODE;
    private String DEP_SCH_START_DATETIME;
    private String DEP_SCH_TIMELINES_CODE;
    private String SHIPMENTID;
    private String STOPID;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getSTOPNUMBER() {
		return STOPNUMBER;
	}
	public void setSTOPNUMBER(String sTOPNUMBER) {
		STOPNUMBER = sTOPNUMBER;
	}
	public String getCONTAINER_NO() {
		return CONTAINER_NO;
	}
	public void setCONTAINER_NO(String cONTAINER_NO) {
		CONTAINER_NO = cONTAINER_NO;
	}
	public String getARR_EST_START_DATE_TIME() {
		return ARR_EST_START_DATE_TIME;
	}
	public void setARR_EST_START_DATE_TIME(String aRR_EST_START_DATE_TIME) {
		ARR_EST_START_DATE_TIME = aRR_EST_START_DATE_TIME;
	}
	public String getARR_EST_END_DATE_TIME() {
		return ARR_EST_END_DATE_TIME;
	}
	public void setARR_EST_END_DATE_TIME(String aRR_EST_END_DATE_TIME) {
		ARR_EST_END_DATE_TIME = aRR_EST_END_DATE_TIME;
	}
	public String getARR_TIMELINESCODE() {
		return ARR_TIMELINESCODE;
	}
	public void setARR_TIMELINESCODE(String aRR_TIMELINESCODE) {
		ARR_TIMELINESCODE = aRR_TIMELINESCODE;
	}
	public String getARR_LASTCALCULATEDDATETIME() {
		return ARR_LASTCALCULATEDDATETIME;
	}
	public void setARR_LASTCALCULATEDDATETIME(String aRR_LASTCALCULATEDDATETIME) {
		ARR_LASTCALCULATEDDATETIME = aRR_LASTCALCULATEDDATETIME;
	}
	public String getARR_ACT_START_DATETIME() {
		return ARR_ACT_START_DATETIME;
	}
	public void setARR_ACT_START_DATETIME(String aRR_ACT_START_DATETIME) {
		ARR_ACT_START_DATETIME = aRR_ACT_START_DATETIME;
	}
	public String getARR_ACT_TIMELINES_CODE() {
		return ARR_ACT_TIMELINES_CODE;
	}
	public void setARR_ACT_TIMELINES_CODE(String aRR_ACT_TIMELINES_CODE) {
		ARR_ACT_TIMELINES_CODE = aRR_ACT_TIMELINES_CODE;
	}
	public String getARR_SCH_START_DATETIME() {
		return ARR_SCH_START_DATETIME;
	}
	public void setARR_SCH_START_DATETIME(String aRR_SCH_START_DATETIME) {
		ARR_SCH_START_DATETIME = aRR_SCH_START_DATETIME;
	}
	public String getARR_SCH_TIMELINES_CODE() {
		return ARR_SCH_TIMELINES_CODE;
	}
	public void setARR_SCH_TIMELINES_CODE(String aRR_SCH_TIMELINES_CODE) {
		ARR_SCH_TIMELINES_CODE = aRR_SCH_TIMELINES_CODE;
	}
	public String getDEP_EST_START_DATE_TIME() {
		return DEP_EST_START_DATE_TIME;
	}
	public void setDEP_EST_START_DATE_TIME(String dEP_EST_START_DATE_TIME) {
		DEP_EST_START_DATE_TIME = dEP_EST_START_DATE_TIME;
	}
	public String getDEP_EST_END_DATE_TIME() {
		return DEP_EST_END_DATE_TIME;
	}
	public void setDEP_EST_END_DATE_TIME(String dEP_EST_END_DATE_TIME) {
		DEP_EST_END_DATE_TIME = dEP_EST_END_DATE_TIME;
	}
	public String getDEP_TIMELINESCODE() {
		return DEP_TIMELINESCODE;
	}
	public void setDEP_TIMELINESCODE(String dEP_TIMELINESCODE) {
		DEP_TIMELINESCODE = dEP_TIMELINESCODE;
	}
	public String getDEP_LASTCALCULATEDDATETIME() {
		return DEP_LASTCALCULATEDDATETIME;
	}
	public void setDEP_LASTCALCULATEDDATETIME(String dEP_LASTCALCULATEDDATETIME) {
		DEP_LASTCALCULATEDDATETIME = dEP_LASTCALCULATEDDATETIME;
	}
	public String getDEP_ACT_START_DATETIME() {
		return DEP_ACT_START_DATETIME;
	}
	public void setDEP_ACT_START_DATETIME(String dEP_ACT_START_DATETIME) {
		DEP_ACT_START_DATETIME = dEP_ACT_START_DATETIME;
	}
	public String getDEP_ACT_TIMELINES_CODE() {
		return DEP_ACT_TIMELINES_CODE;
	}
	public void setDEP_ACT_TIMELINES_CODE(String dEP_ACT_TIMELINES_CODE) {
		DEP_ACT_TIMELINES_CODE = dEP_ACT_TIMELINES_CODE;
	}
	public String getDEP_SCH_START_DATETIME() {
		return DEP_SCH_START_DATETIME;
	}
	public void setDEP_SCH_START_DATETIME(String dEP_SCH_START_DATETIME) {
		DEP_SCH_START_DATETIME = dEP_SCH_START_DATETIME;
	}
	public String getDEP_SCH_TIMELINES_CODE() {
		return DEP_SCH_TIMELINES_CODE;
	}
	public void setDEP_SCH_TIMELINES_CODE(String dEP_SCH_TIMELINES_CODE) {
		DEP_SCH_TIMELINES_CODE = dEP_SCH_TIMELINES_CODE;
	}
	public String getSHIPMENTID() {
		return SHIPMENTID;
	}
	public void setSHIPMENTID(String sHIPMENTID) {
		SHIPMENTID = sHIPMENTID;
	}
	public String getSTOPID() {
		return STOPID;
	}
	public void setSTOPID(String sTOPID) {
		STOPID = sTOPID;
	}

   
}
