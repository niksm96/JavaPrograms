package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Stack;
import com.bridgelabz.util.Utility;

public class PrimeOnStack {
	public static void main(String[] args) {
		  Stack stack=new Stack();
		    List<Integer> list1 = new ArrayList<Integer>();
		    List<Integer> list2 = new ArrayList<Integer>();
		    List<Integer> list3 = new ArrayList<Integer>();
		    Set<Integer> set = new HashSet<Integer>();
		    list2 = AlgorithmUtility.primeNumbers(0, 1000); //finding prime
		    set = Utility.anagramPrime(list2); //finding anagram
		    list1.addAll(set);
		    int [] intArr=new int[list1.size()];
		    for(int i=0;i<intArr.length;i++)
		    {
		        intArr[i]=list1.get(i);
		    }
//		    intArr=AlgorithmUtility.bubbleSort(intArr, n);
		    for(int i:intArr)
		    {
		        list3.add(i);
		    }
		    System.out.println("Is the list of prime numbers :"+list3.size());
		    System.out.println(list3);
		    for(int i=0;i<list3.size();i++)
		    {
		        stack.push(list3.get(i));
		    }
		    System.out.println("Printing the elements in reverse order using pop function of stack");
		    while(!stack.isStackEmpty())
		    {
		        System.out.print(stack.pop()+" ");
		    }
	}
}
