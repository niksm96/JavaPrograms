/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.StopWatch 
 *  
 *  Purpose: Write a Stopwatch Program for measuring the time that elapses between
 *  		 the start and end clicks
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class StopWatch {
	
	/*
	* The main function is written to take input from the user and
	* call stopWatch function that measures elapsed time
	*/
	public static void main(String[] args) {
		System.out.println("Enter true to start and false to end");
		FunctionalUtilty fu=new FunctionalUtilty();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.stopWatch();
	}
}
