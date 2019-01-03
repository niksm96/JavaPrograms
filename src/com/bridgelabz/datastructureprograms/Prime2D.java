package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;

public class Prime2D {
	public static void main(String[] args){
		List<ArrayList<Integer>> aList =new ArrayList<ArrayList<Integer> >(); 
		List<Integer> a1=new ArrayList<>();
		List<Integer> a2=new ArrayList<>();
		a1.addAll(AlgorithmUtility.primeNumbers());
		System.out.println(a1);
		a2=a1.subList(0, 25);
		System.out.println(a2);
		
	}
}
