/******************************************************************************
 *  Compilation:  javac -d bin SwapNibble.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SwapNibble
 *  
 *  Purpose: To read an integer as an Input, convert to Binary using toBinary
 *  		 function and perform the following functions:
 * 			 	i. Swap nibbles and find the new number.
 *  			ii. Find the resultant number is the number is a power of 2
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class SwapNibble {
	
	/*
	* The main function is written to take input from the user and
	* calls swapNibble function to find the result after swapping
	* nibbles
	*/
	public static void main(String[] args) {
		System.out.println("Enter the integer");
		
		//Reading input from the user
		int x=AlgorithmUtility.userInt();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		String bin=AlgorithmUtility.toBinary(x);
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		String str_bin=AlgorithmUtility.swapNibble(bin);
		
		System.out.println("After swapping nibbles: "+str_bin);
		
	}
}
