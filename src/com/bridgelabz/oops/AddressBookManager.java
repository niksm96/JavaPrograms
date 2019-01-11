package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.util.OopsUtility;

public class AddressBookManager {
	
	AddressBook ab=new AddressBook();
	ObjectMapper objMap=new ObjectMapper();
	
	
	public void createBook() throws IOException{
		System.out.println("Enter name of address book");
		String book=OopsUtility.userString();
		File file=new File("E:\\BridgeLabz\\JavaPrograms\\"+book+".json");
		boolean rs=file.createNewFile();
		if(rs){
			System.out.println("File is created");
		}
		else{
			System.out.println("File of that name already exists");
		}
	}
	
	public void openBook() throws IOException{
		System.out.println("Files available");	
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for(File file:arrayOfFiles){
			System.out.println(file);
		} 
		System.out.println("Choose the address book");
		String ch_book=OopsUtility.userString();
		for(File file:arrayOfFiles){
			if(ch_book.equals(file.getName())){
					addressBook();
			}
		}
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
