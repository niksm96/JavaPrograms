/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.LeapYear 
 *  
 *  Purpose: Determines whether the given year is a leap year or not.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class LeapYear {

	/*
	* The main function is written to take input from the user and
	* call leapYear function that determines if a year is a leap 
	* year or not
	*/
	public static void main(String[] args) {
			System.out.println("Enter year");
			FunctionalUtilty fu=new FunctionalUtilty();
			
			//Method 1- using non-static function of FunctionalUtilty class
			//of com.bridgelabz.util package
			fu.leapYear();
		}


}
