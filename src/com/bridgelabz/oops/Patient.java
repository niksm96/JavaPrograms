/******************************************************************************
 *  Compilation:  javac -d bin Patient.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Patient.java n
 *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   10-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

public class Patient {
	private int id;
	private String name;
	private int age;
	private long phoneNo;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
