/******************************************************************************
 *  Compilation:  javac -d bin SumZero.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.SumZero 
 *  
 *  Purpose: A program with cubic running time. Read in N integers and counts the
			 number of triples that sum to exactly 0.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
public class SumZero {

	/*
	* The main function is written to take input from the user and
	* call sumZero function that counts the 
	* number of triples that sum to exactly 0.
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of integers");
		
		//Reading the input from the user
		int num=FunctionalUtilty.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		FunctionalUtilty.sumZero(num);

	}

}
