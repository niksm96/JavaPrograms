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

import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class PrimeNumbers {
	
	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Reading inputs from user
		System.out.println("Enter the range: say m and n");
		System.out.println("Enter m");
		int m=s.nextInt();
		System.out.println("Enter n");
		int n=s.nextInt();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.primeNumbers(m,n);
		s.close();
	}

}
