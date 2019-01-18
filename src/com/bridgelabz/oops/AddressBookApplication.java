/******************************************************************************
 *  Compilation:  javac -d bin AddressBookApplication.java
 *  Execution:    java -cp bin com.bridgelabz.oops.AddressBookApplication.java n
 *  
 *  Purpose: The program is to maintain an address books
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication {
	
	/*
	* The main function is written to take input from the user and
	* calls various methods that performs operation on address book 
	*/
	public static void main(String[] args) throws IOException {
		
		AddressBookManager addBookMan = new AddressBookManager();
		do {
			System.out.println("Enter your choice");
			System.out.println(" 1:Create Book \n 2:Open Book \n 3:Save Book \n 4:Save As \n 5:Close Book \n 6:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				
				//Method 1- using non-static function of AddressBookManager class
				//of com.bridgelabz.oops package
				addBookMan.createBook();
				
				break;
			case 2:
				
				//Method 2- using non-static function of AddressBookManager class
				//of com.bridgelabz.oops package
				addBookMan.openBook();
				
				break;
			case 3:
				
				//Method 3- using non-static function of AddressBookManager class
				//of com.bridgelabz.oops package
				addBookMan.saveBook();
				
				break;
			case 4:
				
				//Method 4- using non-static function of AddressBookManager class
				//of com.bridgelabz.oops package
				addBookMan.saveAsBook();
				
				break;
			case 5:
				
				//Method 5- using non-static function of AddressBookManager class
				//of com.bridgelabz.oops package
				addBookMan.close();
				
				break;
			case 6:
				System.out.println("Quit");
				addBookMan = null;
				break;

			}
		}while(addBookMan != null);
		System.out.println("You have exited");

	}
}
