/******************************************************************************
 *  Compilation:  javac -d bin InventoryList.java
 *  Execution:    java -cp bin com.bridgelabz.oops.InventoryList.java n
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

import java.util.ArrayList;
import java.util.List;

public class InventoryList {
	private String inventoryName;
	
	private List<Inventory> listofInventories=new ArrayList<Inventory>();

	public String getInventoryName() {
		return inventoryName;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public List<Inventory> getListofInventories() {
		return listofInventories;
	}

	public void setListofInventories(List<Inventory> listofInventories) {
		this.listofInventories = listofInventories;
	}
	
}
