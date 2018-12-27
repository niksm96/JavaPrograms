/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.TemperatureConversion 
 *  
 *  Purpose: Converts the temperture given to Fahrenheit or Celcius temperature
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion {
	
	/*
	* The main function is written to take input from the user and
	* call the tempConversion function that converts temperature
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter the choice to convert to the following:");
		System.out.println("1-Fahrenheit 2-Celcius");
		
		//Reading the choice of the user
		int choice=AlgorithmUtility.userInt();
		
		System.out.println("Enter the temp");
		
		//Reading the input from the user
		double temp=AlgorithmUtility.userDouble();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		double conv_temp=AlgorithmUtility.temperatureConversion(choice,temp);
		System.out.println(conv_temp);
		
	}
}
