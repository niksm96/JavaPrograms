package com.bridgelabz.oops;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private long zipcode;
	
	public Address(){
		street=null;
		city=null;
		state=null;
		zipcode=0;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
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
	
	public long getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	
}
