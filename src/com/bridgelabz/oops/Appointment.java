/******************************************************************************
 *  Compilation:  javac -d bin Appointment.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Appointment.java n
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

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	private String docName;
	
	private List<Patient> listOfPatients = new ArrayList<Patient>();
	
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	
	public List<Patient> getListOfPatients() {
		return listOfPatients;
	}
	
	public void setListOfPatients(List<Patient> listOfPatients) {
		this.listOfPatients = listOfPatients;
	}
	


}
