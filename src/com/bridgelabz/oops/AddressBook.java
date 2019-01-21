/******************************************************************************
 *  Compilation:  javac -d bin AddressBook.java
 *  Execution:    java -cp bin com.bridgelabz.oops.AddressBook.java n
 *  
 *  Purpose: The program is to maintain an address books
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.bridgelabz.util.OopsUtility;

public class AddressBook {

	/**
	 * listOfpersons is the list of persons in a address book and is declared
	 * private and static in order to main single copy of the list.
	 */
	private static List<Person> listOfPerson = new ArrayList<Person>();

	/**
	 * Function to add a person in the specified address book
	 */
	public void addPerson() {
		Person person = new Person();
		System.out.println("Enter first name");
		person.setFirstName(OopsUtility.userString());
		System.out.println("Enter last name");
		person.setLastName(OopsUtility.userString());
		System.out.println("Enter contact number");
		person.setContactNo(OopsUtility.userLong());

		// Function call to add the address details of the person
		
		person.setAddress(addressDetails());
		listOfPerson.add(person);
	}

	/**
	 * Function to set the address of the person to be added
	 * 
	 * @return address the address object
	 */
	public Address addressDetails() {
		Address address = new Address();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.userString());
		System.out.println("Enter city");
		address.setCity(OopsUtility.userString());
		System.out.println("Enter state");
		address.setState(OopsUtility.userString());
		System.out.println("Enter zipcode");
		address.setZipcode(OopsUtility.userLong());
		return address;
	}

	/**
	 * Function to edit the details of the specified person in a particular address
	 * book
	 */
	public void editPerson() {
		System.out.println("Enter the details of the person whose information needs to be modified");
		System.out.println("Enter first name");
		String firstName = OopsUtility.userString();
		System.out.println("Enter last name");
		String lastName = OopsUtility.userString();
		Optional<Person> optional = listOfPerson.parallelStream()
				.filter(person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()))
				.findAny();
		if (optional.isPresent())
			editUpdate(optional.get());
		else
			System.out.println("Person of that name is not present");
	}

	public void editUpdate(Person per) {
		do {
			System.out.println("Enter the choice you want modify");
			System.out.println("1:Contact Number  2:Address");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the new contact number");
				long newContact = OopsUtility.userLong();
				per.setContactNo(newContact);
				System.out.println("Your contact number is updated");
				break;
			case 2:
				Address address = per.getAddress();

				// Function call to modify the address details of the specified person
				addressUpdate(address);

				per.setAddress(address);
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (per != null);
	}

	/**
	 * Function to set the address of the person
	 * 
	 * @param address the address that is obtained by the specified person
	 */
	public void addressUpdate(Address address) {
		do {
			System.out.println("Enter the details of address you want to change");
			System.out.println("1:Street  2:City  3:State  4:Zipcode");
			int ch = OopsUtility.userInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the street");
				String newStreet = OopsUtility.userString();
				address.setStreet(newStreet);
				System.out.println("Your street is updated");
				break;
			case 2:
				System.out.println("Enter the city");
				String newCity = OopsUtility.userString();
				address.setCity(newCity);
				System.out.println("Your city is updated");
				break;
			case 3:
				System.out.println("Enter the state");
				String newState = OopsUtility.userString();
				address.setState(newState);
				System.out.println("Your state is updated");
				break;
			case 4:
				System.out.println("Enter the zipcode");
				long newZip = OopsUtility.userLong();
				address.setZipcode(newZip);
				System.out.println("Your zip code has been updated");
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
			}
		} while (address != null);
	}

	/**
	 * Function to display the list of persons in the particular address book
	 */
	public void display() {
	listOfPerson.forEach(person->{
			System.out.println("First Name: " + person.getFirstName());
			System.out.println("Last Name: " + person.getLastName());
			System.out.println("Contact Number: " + person.getContactNo());
			Address add = person.getAddress();
			System.out.println("Street: " + add.getStreet());
			System.out.println("City: " + add.getCity());
			System.out.println("State: " + add.getState());
			System.out.println("Zip code: " + add.getZipcode());
			System.out.println("-------------------------------------");
		});
	}

	/**
	 * Function to delete the person in a specified address book
	 */
	public void deletePerson() {
		System.out.println("Enter the details of person to delete");
		System.out.println("Enter first name");
		String firstName = OopsUtility.userString();
		System.out.println("Enter last name");
		String lastName = OopsUtility.userString();
		if (!listOfPerson.isEmpty()) {
			boolean isRemoved = listOfPerson.removeIf(
					person -> firstName.equals(person.getFirstName()) && lastName.equals(person.getLastName()));
			if (isRemoved)
				System.out.println("The person has been deleted");
			else
				System.out.println("The person of that name does'nt exist");
		} else
			System.out.println("Address Book is empty!");
	}

	/**
	 * Function to sort the persons in the specified address book by their last name
	 */
	public void sortByLastName() {
		Collections.sort(listOfPerson, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
	}

	/**
	 * Function to sort the persons in the specified address book by zip code
	 */
	public void sortByZipCode() {
		Collections.sort(listOfPerson,
				(person1, person2) -> person1.getAddress().getZipcode() > person2.getAddress().getZipcode() ? 1
						: person1.getAddress().getZipcode() < person2.getAddress().getZipcode() ? -1
								: person1.getAddress().getZipcode() == person2.getAddress().getZipcode() ? 0 : -10);

	}
}
