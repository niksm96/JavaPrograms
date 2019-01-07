/******************************************************************************
 *  Compilation:  javac -d bin PrimeOnStack.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.PrimeOnStack n
 *  
 *  Purpose: ­> Add the Prime Numbers that are Anagram in the Range of 0 ­ 1000 in 
 *  			a Stack using the Linked List and Print the Anagrams in the 
 *  			Reverse Order.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.StackLinkedList;

public class PrimeOnStack {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using stack
	*/
	public static void main(String[] args) {
		
		 //Customized Stack
		  StackLinkedList<Integer> st=new StackLinkedList<>();
		  
		  List<Integer> list1 = new ArrayList<Integer>();
		  
		//Method 1- using function of AlgorithmUtility class of
		//com.bridgelabz.util package
		  list1 = AlgorithmUtility.primeNumbers(0, 1000);
		
		  for(int i=0;i<list1.size();i++){
			  for(int j=i+1;j<list1.size();j++){
		
				//Method 2- using function of AlgorithmUtility class of
				//com.bridgelabz.util package
				  if(AlgorithmUtility.isAnagram(String.valueOf(list1.get(i)),String.valueOf( list1.get(j)))){
					 
					//Method 3- using function of StackLinkedList class of
					//com.bridgelabz.util package
					  st.push(list1.get(i));
					  st.push(list1.get(j));
				}
			}
		}
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    
	    //Method 4- using function of StackLinkedList class of
		//com.bridgelabz.util package
	    while(!st.isEmpty()){
	    	
	    	//Method 5- using function of StackLinkedList class of
			//com.bridgelabz.util package
	        System.out.println(st.pop()+" "+st.pop());
	    }		   
	}
}
