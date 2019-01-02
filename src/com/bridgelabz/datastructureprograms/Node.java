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

public class Node<T> {
	public T data;
	public Node<T> next;
	
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
}
