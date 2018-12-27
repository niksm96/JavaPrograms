/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.MonthlyPayment 
 *  
 *  Purpose: Determines monthly payment for the given principle amount,
 *  		 years to pay off and percentage rate of the interest amount.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {
	
	/*
	* The main function is written to take input from the user and
	* call the monthlyPayment() function calculates monthly payment
	*/
	public static void main(String[] args) {
		//Reading inputs from user
		System.out.println("Enter the principle loan amount");
		int principle=AlgorithmUtility.userInt();
		System.out.println("Enter the years to pay off");
		int year=AlgorithmUtility.userInt();
		System.out.println("Enter the percentage for interest amount");
		double rate=AlgorithmUtility.userDouble();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		double monthly_payment=AlgorithmUtility.monthlyPayment(principle,year,rate);
		System.out.println("The monthly payment= "+monthly_payment);
	}
}
