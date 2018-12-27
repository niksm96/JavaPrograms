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

public class BubbleSort {
	
	/*
	* The main function is written to take input from the user and and 
	* call the bubbleSort function that sorts array of integers
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of intergers to be sorted");
		
		//Reading input number of integers to be sorted from user
		int n=AlgorithmUtility.userInt();
		
		int[] array=new int[50];
		
		System.out.println("Enter the integers");
		
		//Reading input integers entered by the user
		for(int i=0;i<n;i++) {
			array[i]=AlgorithmUtility.userInt();
		}
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		int[] res_array=AlgorithmUtility.bubbleSort(array,n);
		
		System.out.println("The sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.println(res_array[i]);
		}
	}

}
