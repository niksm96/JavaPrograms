/******************************************************************************
 *  Compilation:  javac -d bin Palindrome.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprogram.Palindrome n
 *  
 *  Purpose: ­> A palindrome is a string that reads the same forward and backward.
 *  		 	To construct an algorithm to input a string of characters and 
 *  			check whether it is a palindrome.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   04-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Dequeue;

public class Palindrome {
	
	/*
	* The main function is to read the input from the user
	* and checking whether the entered string is palindrome 
	* or not
	*/
	public static void main(String[] args) {
		
		//Customized character
		Dequeue<Character> dq=new Dequeue<Character>();
		
		System.out.println("Enter a String: ");
		String s=CustomLinkedList.userString();
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
		
			//Method 1- using function of Deque class of
			//com.bridgelabz.util package
			dq.addFront(ch[i]);
			
		}
		int flag=0;
		
		//Method 2- using function of Deque class of
		//com.bridgelabz.util package
		while(dq.size()>1){
			
			//Method 3- using function of Deque class of
			//com.bridgelabz.util package
			
			//Method 4- using function of Deque class of
			//com.bridgelabz.util package
			if(dq.removeFront()!=dq.removeRear()){
				
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
