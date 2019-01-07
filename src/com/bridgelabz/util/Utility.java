/******************************************************************************
 *  Compilation:  javac -d bin Utility.java
 *  Execution:    java -cp bin com.bridgelabz.util.Utility
 *  
 *  Purpose: Contains some of the functions for the .java files in 
 *  		 com.bridgelabz.datastructureprograms package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class Utility {
	
	/**
	 * Function to find the factorial of a given number
	 * 
	 * @param nodes the number whose factorial needs to be found
	 * @return the factorial of a number 
	 */
	public static int factorial(int nodes){ 
	    if(nodes==0)
	    	return 0;
	    return nodes*factorial(nodes-1); 
	} 
	  
	/**
	 * Function that finds the bionomial co effecient of a number
	 * 
	 * @param nodes the number whose binomial co efficient is to be found
	 * @param k the number
	 * @return the number that represents the binomial coeff
	 */
	public static int binomialCoeff(int nodes, int k){ 
	    int res = 1; 
	    if (k > nodes - k) 
	        k = nodes - k; 
	    for (int i = 0; i < k; ++i){ 
	        res *= (nodes - i); 
	        res /= (i + 1); 
	    } 
	    return res; 
	} 
	  
	/**
	 * FUnction that calculates the catalan number of a number
	 * 
	 * @param nodes the number whose catalan number is to be found
	 * @return the catalan number
	 */
	public static int catalan( int nodes) 
	{
	    int c = binomialCoeff(2 * nodes, nodes); 
	    return c / (nodes + 1); 
	} 

	/**
	 * Function that counts the number of binary search trees are possible
	 * for a given number of nodes
	 * 
	 * @param nodes the number of nodes
	 * @return the count of binary search tree
	 */
	public static int numberOfBST(int nodes){
		int count = catalan(nodes); 
		return count; 
	}
	
	/**
	 * Function that checks if the prime numbers are anagram or not
	 * 
	 * @param new_lst the list of prime numbers 
	 * @return the list of prime numbers that are anagram
	 */
	public static List<Integer> anagramPrime(List<Integer> new_lst){
		List<Integer> listOfAnagrams=new ArrayList<Integer>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(AlgorithmUtility.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
					listOfAnagrams.add(new_lst.get(i));
					listOfAnagrams.add(new_lst.get(j));
					System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
				}
			}
		}
		return listOfAnagrams;
	}
	
	/**
	 * Function that prints the list of prime numbers that are anagram 
	 * 
	 * @param list of prime numbers that anagram 
	 */
	public static void printPrimeAndAnagram(List<List<Integer>> list)
    {
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            aList = list.get(i);
            if (i == 0) {
                System.out.println("Numbers which are prime and anagram are:"+aList.size());
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            } else {
                System.out.println("Numbers which are prime but not anagram are:"+aList.size());
                System.out.println();
                for (int j = 0; j < aList.size(); j++) {
                    System.out.print(aList.get(j) + " ");
                }
            }
            System.out.println();
        }
    }
	
	/**
	 * Function to sort any kind of data
	 * 
	 * @param array the array of any type that needs to be sorted
	 * @return the array that is sorted
	 */
	public static <T extends Comparable<T>> T[] sort(T[] array) {
		T temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

	/**
	 * Function that checks whether the parantheses in a arithematic
	 * expression is balanced or no
	 * 
	 * @param str the arithematic expression 
	 * @return true if balanced else false
	 */
	public static boolean isBalanced(String str){
	    if (str.isEmpty())
	        return true;
	    StackLinkedList<Character> stack = new StackLinkedList<Character>();
	    for (int i = 0; i < str.length(); i++){
	        char current = str.charAt(i);
	        if (current == '('){
	            stack.push(current);
	        }
	        if (current == ')'){
	            if (stack.isEmpty())
	                return false;
	            char last = stack.peek();
	            if (current == ')' && last == '(')
	                stack.pop();
	            else 
	                return false;
	        }
	    }
	    return stack.isEmpty();
	}
}
