package com.containerSyncUnifiedAPI.batch.models.po;

import java.util.List;

public class Address {
    public String postalCode;
    public List<String> addressLines;
    public String city;
    public String state;
    public String country;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public List<String> getAddressLines() {
		return addressLines;
	}
	public void setAddressLines(List<String> addressLines) {
		this.addressLines = addressLines;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    
    
}
