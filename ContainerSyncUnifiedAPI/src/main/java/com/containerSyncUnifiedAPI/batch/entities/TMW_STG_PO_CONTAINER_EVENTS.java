package com.containerSyncUnifiedAPI.batch.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="TMW_STG_PO_CONTAINER_EVENTS")
public class TMW_STG_PO_CONTAINER_EVENTS
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "ORDER_NUMBER_UV")
	public String ordernumberuv;
	@Column(name = "CONTAINER_NO")
	public String containernumber;
	@Column(name = "EVENT_CODE")
	public String eventcode;
	@Column(name = "TIMEOFEVENT")
	public String timeofevent; 
	@Column(name = "STOP_NUMBER")
	public String stopnumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrdernumberuv() {
		return ordernumberuv;
	}
	public void setOrdernumberuv(String ordernumberuv) {
		this.ordernumberuv = ordernumberuv;
	}
	public String getContainernumber() {
		return containernumber;
	}
	public void setContainernumber(String containernumber) {
		this.containernumber = containernumber;
	}
	public String getEventcode() {
		return eventcode;
	}
	public void setEventcode(String eventcode) {
		this.eventcode = eventcode;
	}
	public String getTimeofevent() {
		return timeofevent;
	}
	public void setTimeofevent(String timeofevent) {
		this.timeofevent = timeofevent;
	}
	public String getStopnumber() {
		return stopnumber;
	}
	public void setStopnumber(String stopnumber) {
		this.stopnumber = stopnumber;
	}
	@Override
	public String toString() {
		return "TMW_STG_PO_CONTAINER_EVENTS [id=" + id + ", ordernumberuv=" + ordernumberuv + ", containernumber="
				+ containernumber + ", eventcode=" + eventcode + ", timeofevent=" + timeofevent + ", stopnumber="
				+ stopnumber + "]";
	}
	
	
	
	
}
