/******************************************************************************
 *  Compilation:  javac -d bin PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.PowerOf2 
 *  
 *  Purpose: This program takes a command­line argument N and prints a table of the
 *  		 powers of 2 that are less than or equal to 2^N.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class PowerOf2 {

	/*
	* The main function is written to take input from the user and
	* call powerOf2 function that prints the table of the powers of 2
	*/
	public static void main(String[] args) {
		System.out.println("Enter the value for n");
		
		//Reading the input from the user
		int n=FunctionalUtilty.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		FunctionalUtilty.powerOf2(n);
	}

}
