package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.List;

public class InventoryList {
	private String inventoryName;
	
	List<Inventory> listofInventories=new ArrayList<Inventory>();

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
