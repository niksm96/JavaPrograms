/******************************************************************************
 *  Compilation:  javac -d bin Prime2D.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.Prime2D n
 *  
 *  Purpose: ­> Store the prime numbers in a 2D Array, the first dimension 
 *  represents the range 0­100,100­200, and so on. While the second dimension 
 *  represents the prime numbers in that range
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

public class Prime2D {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000
	*/

	public static void main(String[] args){
		List<List<Integer>> a1 =new ArrayList<List<Integer>>();
		int start=0;
		int end=100;
		for(int i=0;i<10;i++){
			
			//Method 1- using function of AlgorithmUtility class of
			//com.bridgelabz.util package
			List<Integer> listofPrimeNumbers = AlgorithmUtility.primeNumbers(start,end);
			
			a1.add(listofPrimeNumbers);
			start+=100;
			end+=100;
		}
		for(int i =0; i<a1.size(); i++){
			List<Integer>  primeNumbers = a1.get(i);
			for(int j=0; j<primeNumbers.size(); j++){
				System.out.print(primeNumbers.get(j)+" ");
			}
			System.out.println();
		}
	}
}
