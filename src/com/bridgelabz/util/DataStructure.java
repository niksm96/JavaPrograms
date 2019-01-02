/******************************************************************************
 *  Compilation:  javac -d bin DataStructure.java
 *  Execution:    java -cp bin com.bridgelabz.util.DataStructure
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.datastructureprograms package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/


package com.bridgelabz.util;

import java.util.Scanner;

import com.bridgelabz.datastructureprograms.Node;

public class DataStructure<T> {
	
	private Node<T> head;
	private Node<T> tail;
	     
	public DataStructure(){
		head=null;
	}
	
	/**
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner s=new Scanner(System.in);

	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int userInt(){
			return s.nextInt();
	}
	
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double userDouble(){
			return s.nextDouble();
	}
	
	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
			return s.nextBoolean();
	}
	
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String userString(){
			return s.next();
	}
	
	/**
	 * non-static function to check if the list is empty or not
	 * 
	 * @return true if list is empty else false
	 */
	public boolean isEmpty(){
		return head==null;
	}
	
	public void add(T data){
		Node<T> nd = new Node<T>();
		nd.setData(data);
		System.out.println("Adding: "+data);
		if(isEmpty()){
			head = nd;
			tail = nd;
		} 
		else{
			tail.setNext(nd);
			tail = nd;
		}
	}
	
	public boolean search(T data){
	   Node<T> temp=head;
	   while(temp.getNext()!=null){
		   if(((String) data).compareTo(String.valueOf(temp.getData()))==0){
			   return true;
		   }
		   temp=temp.getNext();
	   }
	   return false;
	}
	
	public int index(T data){
		Node<T> curr=head;
		int count=0;
		while(curr!=null){
			if((String.valueOf(curr.getData())).compareToIgnoreCase(String.valueOf(data))==0){
				curr.getNext();
				return count;
			}
			count++;
			curr=curr.getNext();
		}
		assert(false);
		return 0;
	}
	
	public void remove(int index){
		if(isEmpty())
			return;
		Node<T> temp=head;
		if(index==0){
			head=temp.getNext();
			return;
		}
		for(int i=0;temp!=null && i<index-1;i++){
			temp=temp.getNext();
		}
		if (temp == null || temp.getNext() == null) 
	            return; 
	        Node<T> next = temp.getNext().getNext(); 
	  
	        temp.next = next;
	}
	
	 public void printList(){ 
		 Node<T> tnode = head; 
	     while(tnode!=null) 
	        { 
	            System.out.print(tnode.getData()+" "); 
	            tnode = tnode.getNext(); 
	        } 
	    } 
}
