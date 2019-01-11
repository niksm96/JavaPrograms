package com.bridgelabz.oops;

public class Person {
	private String firstName;
	private String lastName;
	private long contactNo;
	private Address address=new Address();
	
	public Person(){
		firstName=null;
		lastName=null;
		contactNo=0;
		address=null;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
