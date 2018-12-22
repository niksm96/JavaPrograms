/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.Gambler 
 *  
 *  Purpose: Simulates a gambler who start with $stake and place fair $1 bets until 
 *  		he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
 *  		times he/she wins and the number of bets he/she makes and calculate win vs 
 *  		lose percentage.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class Gambler {
	
	/*
	* The main function is written to take input from the user and
	* call gambler function that calculate win and lose percentage
	*/
	public static void main(String[] args) {
		FunctionalUtilty fu=new FunctionalUtilty();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.gambler();
		
		
	}

}
