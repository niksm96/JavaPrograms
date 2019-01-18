/******************************************************************************
 *  Compilation:  javac -d bin ApplicationUtility.java
 *  Execution:    java -cp bin com.bridgelabz.util.ApplicationUtility
 *  
 *  Purpose: Contains some of the functions for the .java files in 
 *  		 com.bridgelabz.oops package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   05-01-2018
 *
 ******************************************************************************/


package com.bridgelabz.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.oops.Inventory;
import com.bridgelabz.oops.InventoryList;

public class ApplicationUtility {
	
	/**
	 * Static Function to replace the regular expression with the pattern
	 * 
	 * @param first the string that represents the first name of the person 
	 * @param fullName the string that represents the full name of the person 
	 * @param phoneNum the string that represents the phone number of the person 
	 * @param date the string that represents the system date  
	 * @param line the template 
	 * @return String the resulted string 
	 */
	public static String replace(String first, String fullName, String phoneNum, String date, String line) {
		final String REGEX_NAME = "<{2}+\\w+>{2}";
		final String REGEX_FULL_NAME = "<{2}+\\w+ +\\w+>{2}";
		final String REGEX_CONTACT = "x{10}";
		final String REGEX_DATE = "<{2}+\\d{2}+/+\\d{2}+/+\\d{4}+>{2}";
		Pattern p1 = Pattern.compile(REGEX_NAME);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);

		Pattern p2 = Pattern.compile(REGEX_FULL_NAME);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);

		Pattern p3 = Pattern.compile(REGEX_CONTACT);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);

		Pattern p4 = Pattern.compile(REGEX_DATE);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}

	/**
	 * Function to insert data in inventory 
	 * @return Inventory the object of Inventory class
	 */
	public static Inventory insertData() {
		Inventory inventory = new Inventory();
		System.out.println("Enter the name:");
		inventory.setName(OopsUtility.userString());
		System.out.println("Enter the weight");
		inventory.setWeight(OopsUtility.userFloat());                  
		System.out.println("Enter the price");
		inventory.setPrice(OopsUtility.userDouble());
		return inventory;
	}

	/**
	 * Function to calculate the price of each inventory
	 *  
	 * @param list the list of inventories
	 */
	public static void calulatePrice(List<InventoryList> list) {
		double eachInventoryValue;
		for (int i = 0; i < list.size(); i++) {
			InventoryList inList = list.get(i);
			System.out.println("Inventory name :" + inList.getInventoryName());
			for (int j = 0; j < inList.getListofInventories().size(); j++) {
				eachInventoryValue = (inList.getListofInventories().get(j).getPrice())
						* (inList.getListofInventories().get(j).getWeight());
				System.out.println("total price:" + eachInventoryValue);
			}
			System.out.println("---------------------------------------------");
		}
	}

	/**
	 * Function to store the deck of cards in queue
	 * 
	 * @param deck the array of strings representing deck of cards
	 * @return Queue of queue of strings
	 */
	public static Queue<Queue<String>> deckQueueStore(String[] deck) {
		Queue<Queue<String>> mainQueue = new Queue<Queue<String>>();
		Queue<String> Queue = new Queue<String>();
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = AlgorithmUtility.bubbleSort(demo, demo.length);
			for (int k = 0; k < str2.length; k++) {
				Queue.insert(str2[k]);
			}
			mainQueue.insert(Queue);
			Queue = new Queue<String>();
			continue;
		}
		return mainQueue;
	}

	/**
	 * Function to display the deck of cards using queue 
	 * 
	 * @param mainQueue
	 */
	public static void displayDeck(Queue<Queue<String>> mainQueue) {
		for (int i = 0; i < mainQueue.getSize(); i++) {
			Queue<String> queue2 = mainQueue.remove();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.remove() + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Function to get the date in the form of string
	 * 
	 * @return string 
	 */
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}
}
