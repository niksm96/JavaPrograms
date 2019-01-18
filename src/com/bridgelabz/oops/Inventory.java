/******************************************************************************
 *  Compilation:  javac -d bin Inventory.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Inventory.java n
 *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   04-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

public class Inventory {
	private String name;
	private float weight;
	private double price;
	
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
