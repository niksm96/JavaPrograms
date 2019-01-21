/******************************************************************************
 *  Compilation:  javac -d bin AddressBookManager.java
 *  Execution:    java -cp bin com.bridgelabz.oops.AddressBookmanager.java n
 *  
 *  Purpose: The program is to maintain an address books
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.util.OopsUtility;

public class AddressBookManager {

	/**
	 * ch_book is the string declared static and private
	 */
	private static String ch_book;

	/**
	 * addressBook is the object of AddressBook class which is declared static and
	 * private and also initialized to zero
	 */
	private AddressBook addressBook = null;

	/**
	 * listOfpersons is the list of persons in a address book and is declared
	 * private and static in order to main single copy of the list.
	 */
	private static List<Person> listOfPersons = new ArrayList<Person>();

	/**
	 * Function to get files
	 * 
	 * @return array of files
	 */
	private File[] getFiles() {
		return new File(System.getProperty("user.dir")).listFiles();
	}

	/**
	 * Function to create an address book that is in the form of a file with .json
	 * extension
	 * 
	 * @throws IOException
	 */
	public void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = OopsUtility.userString();
		File file = new File(book + ".json");
		if (file.createNewFile()) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	/**
	 * Function to open the address book that we enter
	 * 
	 * @throws IOException
	 */
	public void openBook() throws IOException {
		System.out.println("Files available are:");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		ch_book = OopsUtility.userString();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Address book is not empty");
					String string = OopsUtility.readJsonFile(filename);
					listOfPersons = OopsUtility.userReadValue(string, AddressBook.class);

					// Function call to perform various operations on the opened address book
					addressBook();

				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					addressBook();
				}
			}
		}
	}

	/**
	 * Function to write the list of persons on the address book that is opened
	 */
	public void saveBook() {
		System.out.println("Saving " + ch_book + " address book");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(listOfPersons);
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
	}

	/**
	 * Function to save the book with different path, name or extension
	 * 
	 * @throws IOException
	 */
	public void saveAsBook() throws IOException {
		System.out.println("Files available are:");
		File[] arrayOfFiles = getFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book you want to save as with extention");
		String ch_book1 = OopsUtility.userString();
		File file = new File(ch_book1);
		if (file.createNewFile()) {
			System.out.println("File is created");
			String json = OopsUtility.userWriteValueAsString(listOfPersons);
			OopsUtility.writeFile(json, ch_book);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	/**
	 * Function to close the address book
	 */
	public void close() {
		System.out.println("Would you like to save the changes? Y / N");
		String answer = OopsUtility.userString();
		if (answer.equalsIgnoreCase("Y")) {
			saveBook();
		}
		addressBook = null;
	}

	/**
	 * Function that performs various operations on the opened address book
	 * 
	 * @throws IOException
	 */
	public void addressBook() throws IOException {
		addressBook = new AddressBook();
		do {
			System.out.println("Enter choice");
			System.out.println(
					"1:Add Person \n 2:Edit Person \n 3:Display Persons \n 4:Delete Person \n 5:Sort \n 6:Go Back to main ");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:

				// Function call to add a person
				addressBook.addPerson();

				break;
			case 2:

				// Function call to edit the person details
				addressBook.editPerson();

				break;
			case 3:

				// Function call to display the list of persons and their details
				// of a particular address book
				addressBook.display();

				break;
			case 4:

				// Function call to delete the person specified
				addressBook.deletePerson();

				break;
			case 5:

				// Function call to sort the list of persons in multiple ways
				sort();

				break;
			case 6:

				// Function call to the main method
				AddressBookApplication.main(null);

			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (addressBook != null);
	}

	/**
	 * Function to sort the list of persons of the opened book by their last name
	 * and by their address zipcode
	 */
	public void sort() {
		System.out.println("Enter your choice");
		System.out.println("1:Sort by Last Name  2:Sort by Zip Code");
		int ch = OopsUtility.userInt();
		switch (ch) {
		case 1:
			System.out.println("Sorting by last name");

			// Function call to sort the list of persons by their last name
			addressBook.sortByLastName();

			System.out.println("Your list is sorted");
			break;
		case 2:
			System.out.println("Sorting by zip code");

			// function call to sort the list of persons by their address zip code
			addressBook.sortByZipCode();

			System.out.println("Your list is sorted");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
