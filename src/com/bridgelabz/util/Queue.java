package com.bridgelabz.util;

import com.bridgelabz.datastructureprograms.Node;

public class Queue<T>{
	public Node<T> front,rear;
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
	
	public void insert(T data){
		Node<T> node=new Node<T>(data,null);
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
	
	public T remove(){
		if(isQueueEmpty())
			System.out.println("Underflow");
		Node<T> curr=front;
		front = curr.getNext();        
        if (front == null){
            rear =null;
			size-- ; 
		}       
        return curr.getData();
	}
	
	 public void display(){  
		if(isQueueEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		else{
			Node<T> tNode=front;
			while(tNode!=null){
				System.out.print(tNode.data+" ");
				tNode=tNode.next;
			}
			
		}
	 }
}
