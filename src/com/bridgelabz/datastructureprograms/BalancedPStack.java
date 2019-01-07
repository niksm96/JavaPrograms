/******************************************************************************
 *  Compilation:  javac -d bin BalancedPStack.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BalancedPStack n
 *  
 *  Purpose: ­> Take an Arithmetic Expression such as
 *  (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
 *  performance of operations. Ensure parentheses must appear in a balanced
 *  fashion.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Utility;

public class BalancedPStack {
	
	/*
	* The main function is written to take input from the user and and 
	* call the isBalanced function that checks if the parantheses of 
	* the entered arithmetic expression
	*/
	public static void main(String[] args){
		System.out.println("Enter the arithmetic expression");
		String a_exp=CustomLinkedList.userString();
		
		//Method 1- using static function of Utility class of
		//com.bridgelabz.util package
		boolean rs=Utility.isBalanced(a_exp);
		
		if(rs)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
