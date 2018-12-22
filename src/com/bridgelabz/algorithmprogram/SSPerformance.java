/******************************************************************************
 *  Compilation:  javac -d bin SSPerformance.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SSPerformance 
 *  
 *  Purpose: Search and Sorted the given list and print elapsed time
 *  		 performance in descending order
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class SSPerformance {

	/*
	* The main function is written to take input from the user and
	* call the following functions that sorts the given array:
	* 	(i)bubbleSort method for integers
	* 	(ii)bubbleSort method for strings
	* 	(iii)insertionSort method for integers
	* 	(iv)insertionSort method for strings
	* 	(v)binarySearch method for integers
	* 	(vi)binarySearch method for strings
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of data to be sorted or searched");
		
		//Reading inputs from the user
		int num=s.nextInt();
		
		String array[]=new String[num];
		
		//Reading data entered by the user
		System.out.println("Enter the data");
		for(int i=0;i<num;i++)
			array[i]=s.next();
		
		System.out.println("Choose the algorithm to be implemented from the foll:");
		System.out.println("1:Integer Bubble Sort  2:String Bubble Sort " 
					+ "3:Integer Insertion Sort 4:String Insertion Sort "
					+ "5:Integer Binary Search	6:String Binary Search");
		
		//Reading the choice of the user
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:	long start_time=System.currentTimeMillis();
		
				//Method 1- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.bubbleSortGeneric(array);
				
				long end_time=System.currentTimeMillis();
				double elapsed_time=end_time-start_time;
				System.out.println("Elapsed time: "+elapsed_time);
				break;
				
		case 2: long start_time1=System.currentTimeMillis();
				
				//Method 2- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.bubbleSortGeneric(array);
				
				long end_time1=System.currentTimeMillis();
				double elapsed_time1=end_time1-start_time1;
				System.out.println("Elapsed time: "+elapsed_time1);
				break;
				
		case 3: long start_time2=System.currentTimeMillis();
		
				//Method 3- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.insertionSortGeneric(array,num);
				
				long end_time2=System.currentTimeMillis();
				double elapsed_time2=end_time2-start_time2;
				System.out.println("Elapsed time: "+elapsed_time2);
				break;
				
		case 4: long start_time3=System.currentTimeMillis();
		

				//Method 4- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.insertionSortGeneric(array,num);
				
				long end_time3=System.currentTimeMillis();
				double elapsed_time3=end_time3-start_time3;
				System.out.println("Elapsed time: "+elapsed_time3);
				break;
				
		default: System.out.println("Invalid choice");
				 break;
		}
		s.close();
				
	}
	
}
