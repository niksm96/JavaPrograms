package com.bridgelabz.util;

public class Stack {
	int top;
	long[] stackArray;
	
	public Stack(){
		stackArray=new long[100];
		top=-1;
	}
	
	public boolean isStackEmpty(){
		return (top == -1) ? true : false; 
	}
	
	public void push(long x){
		if (top==stackArray.length){ 
			System.out.println("Stack full"); 
		}  
        else{ 
        	stackArray[++top]=x;
        } 
    }
	
	public long pop(){ 
		if (top == -1){ 
			System.out.println("Underflow error"); 
			return '\0'; 
		}  
		else{ 
			return stackArray[top--]; 
		} 
	} 
}
