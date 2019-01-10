package com.bridgelabz.oops;

public class Inventory {
	private String name;
	private float weight;
	private double price;
	
	public Inventory(){
		name=null;
		weight=0f;
		price=0.0;
		
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setWeight(float weight){
		this.weight=weight;
	}
	
	public float getWeight(){
		return weight;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public double getPrice(){
		return price;
	}
	
	
}
