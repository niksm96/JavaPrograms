/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.VendingMachine
 *  
 *  Purpose: To find the fewest notes to be returned to the vending machine
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
import java.util.Scanner;

public class VendingMachine {

	/*
	* The main function is written to take input from the user and
	* call the vendingMachine function that finds the fewest notes 
	* to be returned to the vending machine
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] notes={2000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the amount");
		
		//Reading the input from the user
		int amt=s.nextInt();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.vendingMachine(notes,amt);
		
		s.close();
		
	}
}
