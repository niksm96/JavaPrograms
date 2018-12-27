/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeNumbers 
 *  
 *  Purpose: Finds the prime numbers in the given range
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;

public class PrimeNumbers {
	
	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/
	public static void main(String[] args) {
		
		//Reading inputs from user
		System.out.println("Enter the range: say m and n");
		System.out.println("Enter m");
		int m=AlgorithmUtility.userInt();
		System.out.println("Enter n");
		int n=AlgorithmUtility.userInt();
		
		List<Integer> lst=new ArrayList<>();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		lst=AlgorithmUtility.primeNumbers(m,n);
		
		for(int i:lst)
			System.out.println(i);
		}
		
}
