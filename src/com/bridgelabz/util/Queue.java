package com.bridgelabz.util;

import com.bridgelabz.datastructureprograms.Node;

public class Queue{
	public Node<Integer> front,rear;
	public int size;
	
	public Queue(){
		front=null;
		rear=null;
		size=0;
	}
	
	public boolean isQueueEmpty(){
		return front==null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insert(int data){
		Node<Integer> node=new Node<Integer>(data,null);
		if(rear==null){
			front=node;
			rear=node;
		}
		else{
			rear.setNext(node);
			rear=rear.getNext();
		}
		size++;
	}
	
	public int remove(){
		if(isQueueEmpty())
			System.out.println("Underflow");
		Node<Integer> curr=front;
		front = curr.getNext();        
        if (front == null){
            rear =null;
			size-- ; 
		}       
        return curr.getData();
	}
	
	 public void display(){  
		 int ptr1=0;
		 System.out.print("Available Balance = ");
	     if (size == 0){
	    	 System.out.print("Empty");
	    	 return ;
	     }
	     Node<Integer> ptr = front;
	     while (ptr != rear.getNext()){ 
	    	 ptr1=ptr1+ptr.getData();
	    	 System.out.println(ptr1);
	    	 ptr = ptr.getNext();
	     }	
	     System.out.println();        
	 }
}
