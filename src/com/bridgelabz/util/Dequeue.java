package com.bridgelabz.util;

import com.bridgelabz.datastructureprograms.Node;

public class Dequeue<T> {
	Node<T> front;
	Node<T> rear;
	int size=0;
	
	public boolean isEmpty(){
		if(front==null)
			return true;
		else
			return false;
	}
 
	public int size(){
		return size;
	}
	
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
