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
		System.out.println("Enter the number of data you want to store");
		
		Map<String, Double> elapsed_time=new HashMap<>();
		
		//Reading inputs from the user
		int num=AlgorithmUtility.userInt();

		double et1,et2,et3,et4,et5,et6;
	
		int n=0;
		do{
			System.out.println("Choose the algorithm to be implemented from the foll:");
			System.out.println("1:Integer Bubble Sort  2:String Bubble Sort "); 
			System.out.println("3:Integer Insertion Sort 4:String Insertion Sort");
			System.out.println("5:Integer Binary Search	6:String Binary Search ");
			System.out.println("7:Performace of the above algorithms");
		
			//Reading the choice of the user
			int choice=AlgorithmUtility.userInt();
		
			switch(choice) {
				case 1:	System.out.println("Enter integer values");
						Integer[] numbers=new Integer[num];
						for(int i=0;i<num;i++){
							numbers[i]=AlgorithmUtility.userInt();
						}
						long start_time=System.nanoTime();
			
						//Method 1- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						Integer[] int_array=AlgorithmUtility.bubbleSort(numbers,num);
				
						long end_time=System.nanoTime();
						System.out.println("The array after sorting is: ");
						for(Integer i:int_array)
							System.out.print(i+ " ");
						et1=end_time-start_time;
						elapsed_time.put("Integer Bubble Sort",et1);
						System.out.println("Elapsed time: "+et1);
						break;
				
				case 2: System.out.println("Enter the strings");	
						String[] string=new String[num];
						for(int i=0;i<num;i++){
							string[i]=AlgorithmUtility.userString();
						}
				
						long start_time1=System.nanoTime();
					
						//Method 2- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						String[] res_string=AlgorithmUtility.bubbleSort(string,num);
						
						long end_time1=System.nanoTime();
						System.out.println("The array after sorting is:");
						for(String str:res_string)
							System.out.println(str);
						et2=end_time1-start_time1;
						elapsed_time.put("String Bubble Sort",et2);
						System.out.println("Elapsed time: "+et2);
						break;
					
				case 3: System.out.println("Enter the integers");	
						Integer[] in_num=new Integer[num];
						for(int i=0;i<num;i++){
							in_num[i]=AlgorithmUtility.userInt();
						}
					
						long start_time2=System.nanoTime();
		
						//Method 3- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						Integer[] res_in=AlgorithmUtility.insertionSort(in_num,num);
						
						long end_time2=System.nanoTime();
						System.out.println("The array of sorted are:");
						for(Integer j:res_in)
							System.out.println(j);
						et3=end_time2-start_time2;
						elapsed_time.put("Integer Insertion Sort",et3);
						System.out.println("Elapsed time: "+et3);
						break;
				
				case 4: System.out.println("Enter the strings");	
						String[] string1=new String[num];
						for(int i=0;i<num;i++){
							string1[i]=AlgorithmUtility.userString();
						}
						long start_time3=System.nanoTime();
		

						//Method 4- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						String[] res_string1=AlgorithmUtility.insertionSort(string1,num);
				
						long end_time3=System.nanoTime();
						System.out.println("The sorted strings are: ");
						for(String str1:res_string1)
							System.out.println(str1);
						et4=end_time3-start_time3;
						elapsed_time.put("String Insertion Sort",et4);
						System.out.println("Elapsed time: "+et4);
						break;
				
				case 5: System.out.println("Enter the integers");	
						Integer[] bin_num=new Integer[num];
						for(int i=0;i<num;i++){
							bin_num[i]=AlgorithmUtility.userInt();
						}
						System.out.println("Enter the key to be searched");
				
						//Reading the key to be searched in the sorted array
						Integer key=AlgorithmUtility.userInt();
				
						long start_time4=System.nanoTime();
		

						//Method 5- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						int index=AlgorithmUtility.binarySearchGeneric(bin_num, key);
	
						long end_time4=System.nanoTime();
						System.out.println("The key you are searching for is under the index= "+index);
						et5=end_time4-start_time4;
						elapsed_time.put("Integer Binary Search",et5);
						System.out.println("Elapsed time: "+et5);
						break;
				
				case 6:  System.out.println("Enter the strings");	
						String[] string2=new String[num];
						for(int i=0;i<num;i++){
							string2[i]=AlgorithmUtility.userString();
						}
						System.out.println("Enter the key to be searched");
						
						//Reading the key to be searched in the sorted array
						String key1=AlgorithmUtility.userString();
						
						long start_time5=System.nanoTime();
		
						//Method 6- using static function of AlgorithmUtility class
						//of com.bridgelabz.util package
						int index1=AlgorithmUtility.binarySearchGeneric(string2, key1);
		
						long end_time5=System.nanoTime();
						System.out.println("The key you are searching for is under the index= "+index1);
						et6=end_time5-start_time5;
						elapsed_time.put("String Binary Search",et6);
						System.out.println("Elapsed time: "+et6);
						break;
				
				default: System.exit(0);
			}
		Map<String, Double> elapsed_time_res=AlgorithmUtility.sortByValue(elapsed_time);
		for (Map.Entry<String, Double> en : elapsed_time_res.entrySet()) { 
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        	}
		n++;
		}while(n<=6);
	}
	
}
