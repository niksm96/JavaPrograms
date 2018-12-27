/******************************************************************************
 *  Compilation:  javac -d bin SquareRoot.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SquareRoot 
 *  
 *  Purpose: Finds the square root of the given number using Newton's Method
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class SquareRoot {
	
	/*
	* The main function is written to take input from the user and
	* call the squareRoot() function that finds square root of a number
	*/
	public static void main(String[] args) {
		
		//Reading input from the user
		System.out.println("Enter the number to find sqaure root of");
		double num=AlgorithmUtility.userDouble();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		double res=AlgorithmUtility.squareRoot(num);
		
		System.out.println("The square root of the given number using Newton's Method is: "+ res);
	}
	
}
