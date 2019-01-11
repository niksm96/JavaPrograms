package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class AddressBookManager {
	
	AddressBook ab=new AddressBook();
	static List<AddressBook> listOfAddBook=new ArrayList<AddressBook>();
	
	public void createBook() throws IOException{
		AddressBook addressBook=new AddressBook();
		File file=new File("E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\AddressBook1.json");
		boolean rs=file.createNewFile();
		if(rs){
			System.out.println("File is created");
		}
		else{
			System.out.println("File of that name already exists");
		}
	}
	
	public void openBook(){
		addressBook();
	}
	
	public void addressBook(){
		AddressBook ab=new AddressBook();
		int op=1;
		while(op==1){
		System.out.println("Enter choice");
		System.out.println("1:Add Person  2:Edit Person  3:Display Persons  4:Delete Person  5:Sort  6:Quit");
		int choice=OopsUtility.userInt();
		switch(choice){
		case 1:ab.addPerson();
				break;
		case 2:ab.editPerson();
				break;
		case 3: ab.display();
				break;
		case 4: ab.deletePerson();
				break;
		case 5: System.out.println("Enter your choice");
				System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
				int ch=OopsUtility.userInt();
				switch(ch){
				case 1: System.out.println("Sorting by last name");
						ab.sortByLastName();
						System.out.println("Your list is sorted");
						break;
				case 2: System.out.println("Sorting by zip code");
						ab.sortByZipCode();
						System.out.println("Your list is sorted");
						break;
				default:System.out.println("Invalid choice");
						System.exit(0);
				
				}
		default: System.out.println("Invalid choice");
				 System.exit(0);
		}
		System.out.println("Do you want to continue? yes then 1 else 0");
		op=OopsUtility.userInt();
		}
	}
}
