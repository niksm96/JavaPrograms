/******************************************************************************
 *  Compilation:  javac -d bin CliniqueManagementApplication.java
 *  Execution:    java -cp bin com.bridgelabz.oops.CliniqueManagementApplication.java n
 *  
 *  Purpose: This application is to manage a clinic
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   12-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManagementApplication {
	
	/*
	* The main function is written to take input from the user and
	* calls various methods that manages the clinic
	*/
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException {
		int n=0;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Take Appointment  4:Famous Doctor  5:Famous Specialization  6:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				
				//Method 1- using non-static function of CliniqueManager class
				//of com.bridgelabz.oops package
				CliniqueManager.add();
				
				break;
			case 2:
				
				//Method 2- using non-static function of CliniqueManager class
				//of com.bridgelabz.oops package
				CliniqueManager.search();
				
				break;
			case 3:
				
				//Method 3- using non-static function of CliniqueManager class
				//of com.bridgelabz.oops package
				CliniqueManager.takeAppointment();
				
				break;
			case 4:
				
				//Method 4- using non-static function of CliniqueManager class
				//of com.bridgelabz.oops package
				CliniqueManager.famousDoctor();
				
				break;
			case 5:
				
				//Method 5- using non-static function of CliniqueManager class
				//of com.bridgelabz.oops package
				CliniqueManager.famousSpecialist();
				
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		}while(n<1);
	}
}
