package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TMW_STG_LTL_SHIPMENT_CAPACITY")
public class TMW_STG_LTL_SHIPMENT_CAPACITY {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="MBLNbr")
	private String mblNbr;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="ACCOUNTCODE1")
	private String accountCode1;
	
	@Column(name="ACCOUNTCODE2")
	private String accountCode2;
	
	@Column(name="ACCOUNTCODE3")
	private String accountCode3;
	
	@Column(name="ACCOUNTCODE4")
	private String accountCode4;
	
	@Column(name="ACCOUNTCODE5")
	private String accountCode5;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountCode1() {
		return accountCode1;
	}

	public void setAccountCode1(String accountCode1) {
		this.accountCode1 = accountCode1;
	}

	public String getAccountCode2() {
		return accountCode2;
	}

	public void setAccountCode2(String accountCode2) {
		this.accountCode2 = accountCode2;
	}

	public String getAccountCode3() {
		return accountCode3;
	}

	public void setAccountCode3(String accountCode3) {
		this.accountCode3 = accountCode3;
	}

	public String getAccountCode4() {
		return accountCode4;
	}

	public void setAccountCode4(String accountCode4) {
		this.accountCode4 = accountCode4;
	}

	public String getAccountCode5() {
		return accountCode5;
	}

	public void setAccountCode5(String accountCode5) {
		this.accountCode5 = accountCode5;
	}
	
}
