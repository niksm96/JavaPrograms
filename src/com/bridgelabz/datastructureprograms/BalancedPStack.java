package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Stack;

public class BalancedPStack {
	public static void main(String[] args){
		Stack s=new Stack();
		System.out.println("Enter the arithmetic expression");
		String a_exp=CustomLinkedList.userString();
		int len=a_exp.length();
		System.out.println("Balancing");
		for(int i=0;i<len;i++){
			char ch=a_exp.charAt(i);
			if(ch=='('){
				s.push(i);
			}
			else if(ch==')'){
				try{
					long p=s.pop()+1;
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
				}catch(Exception e){
					System.out.println("')' at index "+(i+1)+" is unmatched");
				}
			}
		}
		while(!s.isStackEmpty()){
			System.out.println("'(' at index "+(s.pop() +1)+" is unmatched");
		}
	}
}
