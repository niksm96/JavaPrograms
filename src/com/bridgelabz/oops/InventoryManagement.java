package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.OopsUtility;

public class InventoryManagement {
	public static void main(String[] args) throws IOException {
		ObjectMapper objMap = new ObjectMapper();
		List<InventoryList> list = new ArrayList<InventoryList>();
		// InventoryList invenList=new InventoryList();
		List<Inventory> listin = new ArrayList<Inventory>();
		Inventory inventory = new Inventory();
		String filename = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\inventory.json";
		String str = OopsUtility.readJsonFile(filename);
		int count = 10;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Read and Display 2:Add and Write"
					+ " 3:Calculate the total price  4:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				try {
					list = objMap.readValue(str, new TypeReference<List<InventoryList>>() {
					});
					for (int i = 0; i < list.size(); i++) {
						InventoryList inList = list.get(i);
						System.out.println("Inventory name: " + inList.getInventoryName());
						for (int j = 0; j < inList.getListofInventories().size(); j++) {
							System.out.println("Name: " + inList.getListofInventories().get(j).getName());
							System.out.println("Weight: " + inList.getListofInventories().get(j).getWeight());
							System.out.println("Price: " + inList.getListofInventories().get(j).getPrice());
						}
						System.out.println("---------------------------------------------------------------");
					}
				} catch (Exception e) {
					System.out.println("Enter data");
				}
				break;
			case 2:
				int flag = 1;
				int flag1=0;
				try {
					list = objMap.readValue(str, new TypeReference<List<InventoryList>>() {
					});
					while (flag == 1) {
						System.out.println("Enter the inventory name: ");
						String inName = OopsUtility.userString();
						if (!list.isEmpty()) {
							for (InventoryList in : list) {
								if (inName.equals(in.getInventoryName())) {
									listin = in.getListofInventories();
									inventory = OopsUtility.insertData();
									listin.add(inventory);
									flag1=1;
								}
							}
						}
						if (list.isEmpty()||flag1==0) {
							inventory = OopsUtility.insertData();
							listin.add(inventory);
						}
						System.out.println("Do you want to add more? if yes press 1 else 0");
						flag = OopsUtility.userInt();
					}
					System.out.println("The entered element is added to the list");
					String json = objMap.writeValueAsString(list);
					OopsUtility.writeFile(json, filename);
					System.out.println("Inventory list has been written on to file");
				} catch (Exception e) {
					System.out.println("File is empty!");
				}
				break;
			case 3: try{
						list = objMap.readValue(str, new TypeReference<List<InventoryList>>() {});
						OopsUtility.calulatePrice(list);
					}catch(Exception e){
						System.out.println("File is empty!");
					}
			case 4:
				System.exit(0);
			}
			count--;
		} while (count != 0);
	}
}
