/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactors.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.PrimeFactors 
 *  
 *  Purpose: Computes the prime factorization of N using brute force
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class PrimeFactors {
	

	/*
	* The main function is written to take input from the user and
	* call primeFactor function that computes the prime factors.
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number N");
		FunctionalUtilty fu=new FunctionalUtilty();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.primeFactor();
	}
}
