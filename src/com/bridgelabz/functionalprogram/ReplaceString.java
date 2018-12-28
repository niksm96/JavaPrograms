/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.ReplaceString 
 *  
 *  Purpose: User Input and Replace String Template â€œHello <<UserName>>, How are you?â€�
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class ReplaceString {

	/*
	* The main function is written to take input from the user and
	* call replaceString function that replaces the template with user
	* input
	*/
	public static void main(String[] args) {
		String str="Hello <<UserName>>, How are you?";
		System.out.println("Enter the username");
		
		//Reading the input from the user
		String uname=FunctionalUtilty.userString();
		
		
		//Method 1- using non static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		String res=FunctionalUtilty.replaceString(str,uname);
		
		System.out.println(res);
	}

}
