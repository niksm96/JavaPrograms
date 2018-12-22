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
import java.util.Scanner;

public class Distance {

	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x");
		int x=s.nextInt();
		System.out.println("Enter y");
		int y=s.nextInt();
		FunctionalUtilty fu=new FunctionalUtilty();
		double dist=fu.distance(x,y);
		System.out.println(dist);
		s.close();
	}

}
