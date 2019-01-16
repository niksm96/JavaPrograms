/******************************************************************************
 *  Compilation:  javac -d bin Node.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.Node n
 *  
 *  Purpose: Creates a linked list
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

public class Node<T> implements Comparable<T>{
	
	private T data;
	private Node<T> next;
	private Node<T> prev;
	
	/**
	 * Constructors to initialize the instance variables
	 */
	public Node(){
		next=null;
		data=null;
	}
	
	/**
	 * Parameterized Constructors to initialize instance and 
	 * local variables
	 * 
	 * @param data the data to store in the node of a linked list
	 * @param next the address of the next node
	 */
	public Node(T data, Node<T> next){
		this.data=data;
		this.next=next;
	}
	
	/**
	 * Parameterized Constructors to initialise the data
	 * 
	 * @param data the data to store in the node of a linked list 
	 */
	public Node(T data){
		this.data=data;
	}
	
	/**
	 * Getter method to get the data
	 * 
	 * @return
	 */
	public T getData(){
		return data;
	}
	
	/**
	 * Setter method to set the data
	 * 
	 * @param data the data to be set
	 */
	public void setData(T data){
		this.data=data;
	}
	
	/**
	 * Getter method to get the link of the next node
	 * 
	 * @return the link of the next node
	 */
	public Node<T> getNext(){
		return next;
	}
	
	/**
	 * Setter Method to set the link of the next node
	 * 
	 * @param next the link that has the address of the next node
	 */
	public void setNext(Node<T> next){
		this.next=next;
	}
	
	
	/**
	 * Getter Method to get the address of the previous node
	 * 
	 * @return the address of the previous node
	 */
	public Node<T> getPrev(){
		return prev;
	}
	
	/**
	 * Setter Method to get the address of the previous node
	 * 
	 * @return the address of the previous node
	 */
	public void setPrev(Node<T> prev){
		this.prev=prev;
	}
	
	/**
	 * Overriding the compareTo() method of the Comparable 
	 * interface 
	 * 
	 * @param object the instance of a class that needs to be compared 
	 * 		  with the variables.
	 *@return 0 if equal else 1 
	 */
	@Override
	public int compareTo(T obj) {
		if(obj ==this.data){
			return 0;
		} else {
			return 1;
		}
	}
}
