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
import java.util.HashMap;
import java.util.Map;
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
		long et1,et2,et3,et4,et5,et6;
		
		//Reading data entered by the user
		System.out.println("Enter the data");
		for(int i=0;i<num;i++)
			array[i]=s.next();
		
		System.out.println("Choose the algorithm to be implemented from the foll:");
		System.out.println("1:Integer Bubble Sort  2:String Bubble Sort "); 
		System.out.println("3:Integer Insertion Sort 4:String Insertion Sort");
		System.out.println("5:Integer Binary Search	6:String Binary Search ");
		System.out.println("7:Performace of the above algorithms");
		
		//Reading the choice of the user
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:	long start_time=System.nanoTime();
		
				//Method 1- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.bubbleSortGeneric(array);
				
				long end_time=System.nanoTime();
				et1=end_time-start_time;
				System.out.println("Elapsed time: "+et1);
				break;
				
		case 2: long start_time1=System.nanoTime();
				
				//Method 2- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.bubbleSortGeneric(array);
				
				long end_time1=System.nanoTime();
				et2=end_time1-start_time1;
				System.out.println("Elapsed time: "+et2);
				break;
				
		case 3: long start_time2=System.nanoTime();
		
				//Method 3- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.insertionSortGeneric(array,num);
				
				long end_time2=System.nanoTime();
				et3=end_time2-start_time2;
				System.out.println("Elapsed time: "+et3);
				break;
				
		case 4: long start_time3=System.nanoTime();
		

				//Method 4- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				AlgorithmUtility.insertionSortGeneric(array,num);
				
				long end_time3=System.nanoTime();
				et4=end_time3-start_time3;
				System.out.println("Elapsed time: "+et4);
				break;
				
		case 5: System.out.println("Enter the key to be searched");
				
				//Reading the key to be searched in the sorted array
				String key=s.next();
				
				long start_time4=System.nanoTime();
		

				//Method 5- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				int index=AlgorithmUtility.binarySearchGeneric(array, key);
				
				System.out.println("The key you are searching for is under the index= "+index);
	
				long end_time4=System.nanoTime();
				et5=end_time4-start_time4;
				System.out.println("Elapsed time: "+et5);
				break;
				
		case 6: long start_time5=System.nanoTime();
		
				System.out.println("Enter the key to be searched");
		
				//Reading the key to be searched in the sorted array
				String key1=s.next();
		
				//Method 6- using static function of AlgorithmUtility class
				//of com.bridgelabz.util package
				int index1=AlgorithmUtility.binarySearchGeneric(array, key1);
		
				System.out.println("The key you are searching for is under the index= "+index1);

				long end_time5=System.nanoTime();
				et6=end_time5-start_time5;
				System.out.println("Elapsed time: "+et6);
				break;
				
		default: System.out.println("Invalid choice");
				 break;
				 
		}
		s.close();
		
				
	}
	
}
