/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.Quadratic 
 *  
 *  Purpose: To find the roots of the equation a*x*x + b*x + c.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class Quadratic {

	/*
	* The main function is written to take input from the user and
	* call quadratic function that find roots of the equation.
	*/
	public static void main(String[] args) {
		//Reading the inputs from the user
		System.out.println("Equation of the form: a*x*x+b*x+c");
		System.out.println("Enter the value for a");
		int a=FunctionalUtilty.userInt();
		System.out.println("Enter the value for b");
		int b=FunctionalUtilty.userInt();
		System.out.println("Enter the value for c");
		int c=FunctionalUtilty.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		FunctionalUtilty.quadratic(a,b,c);
	}

}
