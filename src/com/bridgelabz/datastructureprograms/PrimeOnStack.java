package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Stack;

public class PrimeOnStack {
	public static void main(String[] args) {
		  Stack st=new Stack();
		  List<Integer> list1 = new ArrayList<Integer>();
		  list1 = AlgorithmUtility.primeNumbers(0, 1000);
		  for(int i=0;i<list1.size();i++){
			  for(int j=i+1;j<list1.size();j++){
				  if(AlgorithmUtility.isAnagram(String.valueOf(list1.get(i)),String.valueOf( list1.get(j)))){
					  st.push(list1.get(i));
					  st.push(list1.get(j));
				}
			}
		}
	    System.out.println("Printing the elements in reverse order using pop function of stack");
	    while(!st.isStackEmpty()){
	        System.out.println(st.pop()+" "+st.pop());
	    }		   
	}
}
