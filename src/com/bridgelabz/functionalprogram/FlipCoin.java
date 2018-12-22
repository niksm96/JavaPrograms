/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.FlipCoin 
 *  
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class FlipCoin {
	
	/*
	* The main function is written to take input from the user and
	* calls perHeadTail function that calculate head vs tail percenatage 
	* after flipping a coin n number of times
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of times the coin is being flipped");
		FunctionalUtilty fu=new FunctionalUtilty();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		fu.perHeadTail();
		
	}

}
