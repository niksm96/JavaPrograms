package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Utility;

public class PrimeAnagram {
	public static void main(String[] args) {
		List<List<Integer>> a1 =new ArrayList<List<Integer>>();
		int start=0;
		int end=1000;
		List<Integer> lst=AlgorithmUtility.primeNumbers(start, end);
		Set<Integer> set=Utility.anagramPrime(lst);
		List<Integer> lst1=new ArrayList<>();
		lst1.addAll(set);
		a1.add(lst1);
		for(int i=0;i<lst1.size();i++){
			if(lst.contains(lst1.get(i))){
				lst.remove(lst1.get(i));
			}
		}
		a1.add(lst);
		Utility.printPrimeAndAnagram(a1);
	}
}
