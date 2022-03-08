package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TMW_PO_CONTAINER_LOOKUP_UNIFIED")
public class OrderContainerLookup {
	
	 	@Id
	    private Long id;
	 	
	 	private String ORDER_NUMBER_UV;
	    private String ORDER_NUMBER_BR;
	    private String CONTAINER_NO;
	    private String CARRIER_CODE;
	    private String CARRIER_NAME;
	    private String LOAD_TYPE;
	    private String BOL_NUMBER;
	    private String EXPORTED;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		

		public String getORDER_NUMBER_UV() {
			return ORDER_NUMBER_UV;
		}
		public void setORDER_NUMBER_UV(String oRDER_NUMBER_UV) {
			ORDER_NUMBER_UV = oRDER_NUMBER_UV;
		}
		public String getORDER_NUMBER_BR() {
			return ORDER_NUMBER_BR;
		}
		public void setORDER_NUMBER_BR(String oRDER_NUMBER_BR) {
			ORDER_NUMBER_BR = oRDER_NUMBER_BR;
		}
		public String getCONTAINER_NO() {
			return CONTAINER_NO;
		}
		public void setCONTAINER_NO(String cONTAINER_NO) {
			CONTAINER_NO = cONTAINER_NO;
		}
		public String getCARRIER_CODE() {
			return CARRIER_CODE;
		}
		public void setCARRIER_CODE(String cARRIER_CODE) {
			CARRIER_CODE = cARRIER_CODE;
		}
		public String getCARRIER_NAME() {
			return CARRIER_NAME;
		}
		public void setCARRIER_NAME(String cARRIER_NAME) {
			CARRIER_NAME = cARRIER_NAME;
		}
		public String getLOAD_TYPE() {
			return LOAD_TYPE;
		}
		public void setLOAD_TYPE(String lOAD_TYPE) {
			LOAD_TYPE = lOAD_TYPE;
		}
		public String getBOL_NUMBER() {
			return BOL_NUMBER;
		}
		public void setBOL_NUMBER(String bOL_NUMBER) {
			BOL_NUMBER = bOL_NUMBER;
		}
		public String getEXPORTED() {
			return EXPORTED;
		}
		public void setEXPORTED(String eXPORTED) {
			EXPORTED = eXPORTED;
		}
	    
	    
	    

}
