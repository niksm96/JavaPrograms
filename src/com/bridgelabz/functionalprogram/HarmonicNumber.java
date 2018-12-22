/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.HarmonicNumber 
 *  
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class HarmonicNumber {
	
	/*
	* The main function is written to take input from the user and
	* call harmonicValue function that prints harmonic value
	*/
	public static void main(String[] args) {
		System.out.println("Enter the value for n");
		FunctionalUtilty fu=new FunctionalUtilty();
		

		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.harmonicValue();
	}

}
