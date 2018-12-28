/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.Distance 
 *  
 *  Purpose: Determines euclidean distance between two points.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class Distance {

	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		//Reading inputs from the user
		System.out.println("Enter x");
		int x=FunctionalUtilty.userInt();
		System.out.println("Enter y");
		int y=FunctionalUtilty.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		double dist=FunctionalUtilty.distance(x,y);
		
		System.out.println("The distance is "+dist);
		
		System.out.println(dist);
	}

}
