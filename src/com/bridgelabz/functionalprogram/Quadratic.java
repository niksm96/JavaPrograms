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
import java.util.Scanner;

public class Quadratic {

	/*
	* The main function is written to take input from the user and
	* call quadratic function that find roots of the equation.
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Reading the inputs from the user
		System.out.println("Equation of the form: a*x*x+b*x+c");
		System.out.println("Enter the value for a");
		int a=s.nextInt();
		System.out.println("Enter the value for b");
		int b=s.nextInt();
		System.out.println("Enter the value for c");
		int c=s.nextInt();
		
		FunctionalUtilty fu=new FunctionalUtilty();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.quadratic(a,b,c);
		
		s.close();
	}

}
