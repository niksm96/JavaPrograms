package com.bridgelabz.util;

import java.util.NoSuchElementException;

import com.bridgelabz.datastructureprograms.Node;

public class StackLinkedList<T> {
	private Node<T> top;
	private int size;
	
	public StackLinkedList(){
		top=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void push(T data){
		Node<T> tnode=new Node<T>(data,null);
		if(top==null)
			top=tnode;
		else{
			 tnode.setNext(top);
	         top = tnode;
		}
		size++;
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("No elements");
			return null;
		}
		Node<T> tnode=top;
		top=tnode.getNext();
		size--;
		return tnode.getData();
	}
	
	public T peek(){
		if (isEmpty() )
			throw new NoSuchElementException("Underflow Exception") ;
		return top.getData();
	}    
}
