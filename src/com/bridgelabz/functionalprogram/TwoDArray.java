/******************************************************************************
 *  Compilation:  javac -d bin TwoDArray.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.TwoDArray 
 *  
 *  Purpose: A library for reading in 2D arrays of integers, doubles, or booleans from
 *  		 standard input and printing them out to standard output.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtilty;

public class TwoDArray {
	
	/*
	* The main function is written to take input from the user and
	* call displayArray function that displays array of any type
	*/
	public static void main(String[] args) {
		FunctionalUtilty<Object> fu=new FunctionalUtilty<Object>();
		
		//Reading the input from the user
		System.out.println("Enter the number of rows: m");
		int m=FunctionalUtilty.userInt();
		System.out.println("Enter the number of columns: n");
		int n=FunctionalUtilty.userInt();
		System.out.println("1:Integer  2:Double  3:Boolean");
		
		//Reading the choice of the user
		int choice=FunctionalUtilty.userInt();
		
		switch(choice){
			case 1: Integer[][] array=new Integer[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							array[i][j]=AlgorithmUtility.userInt();
						}
					}

					//Method 1- using non-static function of FunctionalUtilty class
					//of com.bridgelabz.util package
					fu.displayArray(array);
					
					break;
					
			case 2: Double[][] darray=new Double[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							darray[i][j]=FunctionalUtilty.userDouble();
						}
					}
					

					//Method 2- using non-static function of FunctionalUtilty class
					//of com.bridgelabz.util package
					fu.displayArray(darray);
					
					break;
					
			case 3: Boolean[][] barray=new Boolean[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							barray[i][j]=FunctionalUtilty.userBoolean();
						}
					}
					

					//Method 3- using non-static function of FunctionalUtilty class
					//of com.bridgelabz.util package
					fu.displayArray(barray);
					
					break;
					
			default: System.out.println("Select among the choices"); 
					 break;
		}
	}

}
