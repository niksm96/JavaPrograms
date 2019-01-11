package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class AddressBook {
	static List<Person> listOfPerson=new ArrayList<Person>();
	
	public void addPerson(){
		Person person=new Person();
		System.out.println("Enter first name");
		person.setFirstName(OopsUtility.userString());
		System.out.println("Enter last name");
		person.setLastName(OopsUtility.userString());
		System.out.println("Enter contact number");
		person.setContactNo(OopsUtility.userLong());
		Address address=new Address();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.userString());
		System.out.println("Enter city");
		address.setCity(OopsUtility.userString());
		System.out.println("Enter state");
		address.setState(OopsUtility.userString());
		System.out.println("Enter zipcode");
		address.setZipcode(OopsUtility.userLong());
		person.setAddress(address);
		listOfPerson.add(person);
	}
	
	public void editPerson(){
		int edit=1;
		System.out.println("Enter the details of the person whose information needs to be modified");
		System.out.println("Enter first name");
		String firstName=OopsUtility.userString();
		System.out.println("Enter last name");
		String lastName=OopsUtility.userString();
		for(Person per:listOfPerson){
			if(firstName.equals(per.getFirstName()) && lastName.equals(per.getLastName())){
				while(edit==1){
				System.out.println("Enter the choice you want modify");
				System.out.println("1:Contact Number  2:Address");
				int choice=OopsUtility.userInt();
				switch(choice){
				case 1: System.out.println("Enter the new contact number");
						long newContact=OopsUtility.userLong();
						per.setContactNo(newContact);
						System.out.println("Your contact number is updated");
						break;
				case 2: Address address=per.getAddress();
						int press=1;
						while(press==1){
						System.out.println("Enter the details of address you want to change");
						System.out.println("1:Street  2:City  3:State  4:Zipcode");
						int ch=OopsUtility.userInt();
						switch(ch){
						case 1: System.out.println("Enter the street");
								String newStreet=OopsUtility.userString();
								address.setStreet(newStreet);
								System.out.println("Your street is updated");
								break;
						case 2: System.out.println("Enter the city");
								String newCity=OopsUtility.userString();
								address.setCity(newCity);
								System.out.println("Your city is updated");
								break;
						case 3: System.out.println("Enter the state");
								String newState=OopsUtility.userString();
								address.setState(newState);
								System.out.println("Your state is updated");
								break;
						case 4: System.out.println("Enter the zipcode");
								long newZip=OopsUtility.userLong();
								address.setZipcode(newZip);
								System.out.println("Your zip code has been updated");
								break;
						default: System.exit(0);
						}
						System.out.println("Do you want to continue to change? if yes press 1 else 0");
						press=OopsUtility.userInt();
						}
						per.setAddress(address);
						break;
						
				default:System.exit(0);
				}
				System.out.println("Do you want to continue editing? if yes press 1 else 0");
				edit=OopsUtility.userInt();
				}
			}
		}
	}
	
	public void display(){
		for(Person p:listOfPerson){
			System.out.println("First Name: "+p.getFirstName());
			System.out.println("Last Name: "+p.getLastName());
			System.out.println("Contact Number: "+p.getContactNo());
			Address add=p.getAddress();
			System.out.println("Street: "+add.getStreet());
			System.out.println("City: "+add.getCity());
			System.out.println("State: "+add.getState());
			System.out.println("Zip code: "+add.getZipcode());
			System.out.println("-------------------------------------");
		}
	}
	
	public void deletePerson(){
		System.out.println("Enter the details of person to delete");
		System.out.println("Enter first name");
		String firstName=OopsUtility.userString();
		System.out.println("Enter last name");
		String lastName=OopsUtility.userString();
		if(!listOfPerson.isEmpty()){
			for(Person per:listOfPerson){
				if(firstName.equals(per.getFirstName()) && lastName.equals(per.getLastName())){
					listOfPerson.remove(per);
					System.out.println("The person has been deleted");
					break;
				}
			}
		}		
	}
	
	public void sortByLastName(){
		Collections.sort(listOfPerson,(person1,person2)->person1.getLastName().compareTo(person2.getLastName()));
	}
	
	public void sortByZipCode(){
		Collections.sort(listOfPerson,(person1,person2)->
				person1.getAddress().getZipcode()>person2.getAddress().getZipcode()?1:
					person1.getAddress().getZipcode()<person2.getAddress().getZipcode()?-1:
						person1.getAddress().getZipcode()==person2.getAddress().getZipcode()?0:-10);
		
	}
}
