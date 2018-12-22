/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BubbleSort 
 *  
 *  Purpose: Sorts array of integers.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
import java.util.Scanner;

public class BubbleSort {
	
	/*
	* The main function is written to take input from the user and and 
	* call the bubbleSort function that sorts array of integers
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of intergers to be sorted");
		
		//Reading input number of integers to be sorted from user
		int n=s.nextInt();
		
		int[] array=new int[50];
		
		System.out.println("Enter the integers");
		
		//Reading input integers entered by the user
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.bubbleSort(array,n);
		s.close();
	}

}
