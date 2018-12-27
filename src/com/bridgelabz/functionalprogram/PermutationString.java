/******************************************************************************
 *  Compilation:  javac -d bin PermutationString.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.PermutationString 
 *  
 *  Purpose: Check if the arrays returned by two string functions i.e iterative
 *  		 function and recursive function which gives the permutation of a 
 *  		 given string are equal.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;
import java.util.Scanner;

public class PermutationString {
	
	/*
	* The main function is written to take input from the user and
	* call permute function that compares the permutation resulted 
	* by two methods
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		
		//Reading the input from the user
		String str=s.nextLine();
		char array[]=str.toCharArray();
		int endIndex=str.length()-1;
		int startIndex=0;
		FunctionalUtilty fu=new FunctionalUtilty(50);
		

		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		String[] array1 = fu.permute(array, startIndex, endIndex);
		
		//Prints the result
		for (String string : array1) {
			System.out.println(string);
		}
		s.close();
	}
}
