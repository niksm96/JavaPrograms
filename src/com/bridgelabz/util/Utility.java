package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utility {
	
	public static int factorial(int nodes){ 
	    if(nodes==0)
	    	return 0;
	    return nodes*factorial(nodes-1); 
	} 
	  
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
	  
	public static int catalan( int nodes) 
	{
	    int c = binomialCoeff(2 * nodes, nodes); 
	    return c / (nodes + 1); 
	} 

	public static int numberOfBST(int nodes){
		int count = catalan(nodes); 
		return count; 
	}
	public static Set<Integer> anagramPrime(List<Integer> new_lst){
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(AlgorithmUtility.isAnagram(String.valueOf(new_lst.get(i)),String.valueOf( new_lst.get(j)))){
					set.add(new_lst.get(i));
					set.add(new_lst.get(j));
				}
			}
		}
		return set;
	}
	
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

}
