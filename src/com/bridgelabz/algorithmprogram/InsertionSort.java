/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.InsertionSort
 *  
 *  Purpose: Finds the day of the week for the given date.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.*;
import java.util.*;

public class InsertionSort {
	
	/*
	* The main function is written to take input from the user and calls 
	* the function insertionSort that sorts the array
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of strings to be inserted");
		
		//Reading inputs from the user
		int num=s.nextInt();
		String[] str_array=new String[num];
		for(int i=0;i<num;i++) {
			str_array[i]=s.next();
		}
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		AlgorithmUtility.insertionSort(str_array,num);
		
		s.close();
	}
}
