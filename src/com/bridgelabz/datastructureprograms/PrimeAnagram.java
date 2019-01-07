/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagram.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagram n
 *  
 *  Purpose: ­> 2D Array the numbers that are Anagram and numbers that are not 
 *  			Anagram
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
import com.bridgelabz.util.Utility;

public class PrimeAnagram {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 that anagram and not anagram
	*/
	public static void main(String[] args) {
		
		List<List<Integer>> a1 =new ArrayList<List<Integer>>();
		int start=0;
		int end=1000;
		
		//Method 1- using function of AlgorithmUtility class of
		//com.bridgelabz.util package
		List<Integer> lst=AlgorithmUtility.primeNumbers(start, end);
		
		//Method 2- using function of Utility class of
		//com.bridgelabz.util package
		List<Integer> list=Utility.anagramPrime(lst);
		
		List<Integer> lst1=new ArrayList<>();
		lst1.addAll(list);
		a1.add(lst1);
		for(int i=0;i<lst1.size();i++){
			if(lst.contains(lst1.get(i))){
				lst.remove(lst1.get(i));
			}
		}
		a1.add(lst);
		
		//Method 3- using function of Utility class of
		//com.bridgelabz.util package
		Utility.printPrimeAndAnagram(a1);
	}
}
