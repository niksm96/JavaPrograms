/******************************************************************************
 *  Compilation:  javac -d bin Dequeue.java
 *  Execution:    java -cp bin com.bridgelabz.util.Dequeue
 *  
 *  Purpose: Contains all the functions to create Deque
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;

import com.bridgelabz.datastructureprograms.Node;

public class Dequeue<T> {
	
	/*
	 * Front is of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	private Node<T> front;
	
	/*
	 *rear is of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	private Node<T> rear;
	
	/*
	 * size is of the type integer and is 
	 * declared private to achieve encapsulation 
	 */
	private int size=0;
	
	/**
	 * Function to check if the deque is empty or not
	 * 
	 * @return true if empty else false
	 */
	public boolean isEmpty(){
		if(front==null)
			return true;
		else
			return false;
	}
 
	/**
	 * Function to get the size of the deque
	 * 
	 * @return size
	 */
	public int size(){
		return size;
	}
	
	/**
	 * Function to add the specified element at the front of the deque
	 * 
	 * @param data the element to be added at the front of the deque
	 */
	public void addFront(T data){
		if(front==null){
			Node<T> tNode=new Node<T>(data);
			front=tNode;
			rear=front;
		}
		else{
			Node<T> tNode=new Node<>(data);
			front.prev=tNode;
			tNode.next=front;
			front=tNode;
		}
		size++;
	}
	
	/**
	 * Function to add the specified element at the rear of the deque
	 * 
	 * @param data the element to be added at the rear of the deque
	 */
	public void addRear(T data){
		if(front==null){
			Node<T> tNode=new Node<T>(data);
			front=tNode;
			rear=front;
		}
		else{
			Node<T> tNode=new Node<>(data);
			rear.next=tNode;
			tNode.prev=rear;
			rear=tNode;
		}
		size++;
	}
	
	/**
	 * Function to delete the element from front end of the deque
	 * 
	 * @return the deleted element 
	 */
	public T removeFront(){
		T val=null;
		if(front==null){
			System.out.println("No elements to delete");
		}
		else{
			val=front.data;
			front=front.next;
		}
		size--;
		return val;
	}
	
	/**
	 * Function to delete the element from rear end of the deque
	 * 
	 * @return the deleted element 
	 */
	public T removeRear(){
		T val=null;
		if(front==null){
			System.out.println("No element to delete");
		}
		else{
			val=rear.data;
			rear=rear.prev;
			rear.next=null;
		}
		size--;
		return val;
	}
}
