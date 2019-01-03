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
	public T data;
	public Node<T> next;
	public Node<T> prev;
	
	public Node(){
		next=null;
		data=null;
	}
	
	public Node(T data, Node<T> next){
		this.data=data;
		this.next=next;
	}
	
	public Node(T data){
		this.data=data;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data){
		this.data=data;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public void setNext(Node<T> next){
		this.next=next;
	}
	
	public Node<T> getPrev(){
		return prev;
	}
	
	public void setPrev(Node<T> prev){
		this.prev=prev;
	}
	
	@Override
	public int compareTo(T obj) {
		if(obj ==this.data){
			return 0;
		} else {
			return 1;
		}
	}
}
