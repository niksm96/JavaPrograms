package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.util.OopsUtility;

public class InventoryManagement{
	public static void main(String[] args) throws IOException{
		ObjectMapper obj=new ObjectMapper();
		System.out.println("Read");
		String filename="E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\inventory.json";
//		System.out.println("Enter the choice");
//		System.out.println("1:Add to Inventory  2:Read from the inventory);"
//				+ " 3:Write from the inventory  4:Calculate the total price  5:Quit");
//		int choice=OopsUtility.userInt();
		String str=OopsUtility.readJsonFile(filename);
		System.out.println(str);
		
		
	}
}
