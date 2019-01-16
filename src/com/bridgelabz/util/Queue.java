/******************************************************************************
 *  Compilation:  javac -d bin Queue.java
 *  Execution:    java -cp bin com.bridgelabz.util.Queue
 *  
 *  Purpose: Contains all the functions to create a Queue
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;

import com.bridgelabz.datastructureprograms.Node;

public class Queue<T>{
	
	/*
	 * Front and rear are of the type Node and is 
	 * declared private to achieve encapsulation 
	 */
	private Node<T> front,rear;
	
	/*
	 * size is of the type integer and is 
	 * declared private to achieve encapsulation 
	 */
	private int size;
	
	
	/**
	 * Constructor to initialize the instance variables of 
	 * class Queue
	 */
	public Queue(){
		front=null;
		rear=null;
		size=0;
	}
	
	/**
	 * Function to check if the queue is empty or not
	 * 
	 * @return true if empty else false
	 */
	public boolean isQueueEmpty(){
		return front==null;
	}
	
	/**
	 * Function to get the size of the queue
	 * 
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * Function to insert the specified element in the queue
	 * 
	 * @param data the element to be inserted into the queue
	 */
	public void insert(T data){
		Node<T> node=new Node<T>(data,null);
		if(rear==null){
			front=node;
			rear=node;
		}
		else{
			
			//Function call to set the link present in Node class 
			//of com.bridgelabz.datastructureprograms
			rear.setNext(node);
			
			//Function call to get the link present in Node class 
			//of com.bridgelabz.datastructureprograms
			rear=rear.getNext();
		}
		size++;
	}
	
	/**
	 * Function to remove the element 
	 * 
	 * @return the deleted element 
	 */
	public T remove(){
		if(isQueueEmpty())
			System.out.println("Underflow");
		Node<T> curr=front;
		front = curr.getNext();        
        if (front == null){
            rear =null;
			size-- ; 
		}       
        
      //Function call to get the data present in Node class 
      //of com.bridgelabz.datastructureprograms
        return curr.getData();
	}
	
	/**
	 * Function to display all the elements in the queue
	 */
	 public void display(){  
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		else{
			Node<T> tNode=front;
			while(tNode!=null){
				System.out.print(tNode.getData()+" ");
				tNode=tNode.getNext();
			}
			
		}
	 }
	 
	 
}
