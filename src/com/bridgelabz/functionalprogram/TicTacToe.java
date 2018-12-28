/******************************************************************************
 *  Compilation:  javac -d bin TicTacToe.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.TicTacToe
 *  
 *  Purpose: Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is
 *  		 the Computer and the Player 2 is the user.
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class TicTacToe {
	public static void main(String[] args) {
		
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtilty.play();
	}
}
