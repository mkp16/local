package com.containerSyncUnifiedAPI.batch.models.po;

import java.util.List;

public class BillToLocation{
    public String id;
    public String name;
    public String suppliedId;
    public Address address;
    public Contact contact;
    public List<AdditionalContact> additionalContacts;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuppliedId() {
		return suppliedId;
	}
	public void setSuppliedId(String suppliedId) {
		this.suppliedId = suppliedId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public List<AdditionalContact> getAdditionalContacts() {
		return additionalContacts;
	}
	public void setAdditionalContacts(List<AdditionalContact> additionalContacts) {
		this.additionalContacts = additionalContacts;
	}
    
    
    
}