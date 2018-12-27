/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.ToBinary 
 *  
 *  Purpose: Converts the given decimal number to binary number.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary {

	/*
	* The main function is written to take input from the user and
	* call the toBinary function that converts decimal to binary
	*/
	public static void main(String[] args) {
		System.out.println("Enter the decimal number to be converted");
		
		//Reading the input from the user
		int num=AlgorithmUtility.userInt();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int[] bin=AlgorithmUtility.toBinary(num);
		
		for(int i=bin.length;i>0;i--)
			System.out.print(bin[i]);
		
	}
		
}
