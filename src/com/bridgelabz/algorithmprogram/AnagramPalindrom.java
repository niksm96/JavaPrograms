/******************************************************************************
 *  Compilation:  javac -d bin AnagramPalindrom.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.AnagramPalindrom 
 *  
 *  Purpose: To find the prime numbers that are anagram and palindrome
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;

public class AnagramPalindrom {

	/*
	* The main function is written to take input from the user and
	* call the anagramPalindrom function that finds prime numbers 
	* that are anagram and palindrome
	*/
	public static void main(String[] args) {
		
		System.out.println("Enter the range: say m and n");
		System.out.println("Enter m");
		int m=AlgorithmUtility.userInt();
		System.out.println("Enter n");
		int n=AlgorithmUtility.userInt();
		
		List<Integer> lst=new ArrayList<Integer>();
		
		//Method 1- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		lst=AlgorithmUtility.primeNumbers(m,n);
		
		List<String> new_lst=new ArrayList<String>(lst.size());
		
		for(Integer in:lst){
			new_lst.add(String.valueOf(in));
		}
		System.out.println(new_lst);
		
		Set<String> set=new HashSet<>();
		System.out.println("The prime numbers which are anagrams:");
		
		//Method 2- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		set=AlgorithmUtility.anagramPrime(new_lst);
		
		Set<String> pal_set=new HashSet<String>();
		System.out.println("The prime numbers which are palindrom");
		
		//Method 3- using static function of AlgorithmUtility class of
		//com.bridgelabz.util package
		pal_set=AlgorithmUtility.palindromPrime(set);
		System.out.println(pal_set);
		
		
		
	}
}
