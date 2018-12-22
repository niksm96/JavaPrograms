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
import java.util.Scanner;

public class SquareRoot {
	
	/*
	* The main function is written to take input from the user and
	* call the squareRoot() function that finds square root of a number
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Reading input from the user
		System.out.println("Enter the number to find sqaure root of");
		double num=s.nextDouble();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.squareRoot(num);
		
		s.close();
	}
	
}
