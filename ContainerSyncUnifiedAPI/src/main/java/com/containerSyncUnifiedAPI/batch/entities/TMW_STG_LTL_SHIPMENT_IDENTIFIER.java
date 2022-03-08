package com.containerSyncUnifiedAPI.batch.entities;

import javax.persistence.*;

@Entity
@Table(name="TMW_STG_LTL_SHIPMENT_IDENTIFIER")
public class TMW_STG_LTL_SHIPMENT_IDENTIFIER {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="MblNbr")
	private String mblNbr;
    
    @Column(name="VALUE")
	private String value;
    
    @Column(name="TYPE")
	private String type;
    
    @Column(name="PRIMARYFORTYPE")
	private String primaryForType;
    
    @Column(name="SOURCE")
	private String source;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMblNbr() {
		return mblNbr;
	}

	public void setMblNbr(String mblNbr) {
		this.mblNbr = mblNbr;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPrimaryForType() {
		return primaryForType;
	}

	public void setPrimaryForType(String primaryForType) {
		this.primaryForType = primaryForType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
