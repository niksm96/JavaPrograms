/******************************************************************************
 *  Compilation:  javac -d bin OopsUtility.java
 *  Execution:    java -cp bin com.bridgelabz.util.OopsUtility
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.oops package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   09-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.oops.Inventory;
import com.bridgelabz.oops.InventoryList;

public class OopsUtility {

	/**
	 * static object is created for Scanner class to avoid multiple object
	 * creations of the same class.
	 */
	static Scanner s = new Scanner(System.in);

	/**
	 * static object is created for ObjectMapper class to avoid multiple object
	 * creations of the same class
	 */
	static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * static function to read integers input from the user
	 * 
	 * @return integer values that are read
	 */
	public static int userInt() {
		return s.nextInt();
	}

	/**
	 * static function to read double input from the user
	 * 
	 * @return double values that are read
	 */
	public static double userDouble() {
		return s.nextDouble();
	}

	/**
	 * static function to read boolean input from the user
	 * 
	 * @return boolean values that are read
	 */
	public static boolean userBoolean() {
		return s.nextBoolean();
	}

	/**
	 * static function to read string input from the user
	 * 
	 * @return strings that are read
	 */
	public static String userString() {
		return s.next();
	}

	/**
	 * static function to read string input from the user
	 * 
	 * @return strings that are read in float
	 */
	public static float userFloat() {
		return s.nextFloat();
	}

	/**
	 * static function to read string input from the user
	 * 
	 * @return strings that are read
	 */
	public static long userLong() {
		return s.nextLong();
	}

	public static <T> List<T> userReadValue(String str, Class<?> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}

	/**
	 * Static Function to replace the regular expression with the pattern
	 * 
	 * @param first
	 * @param fullName
	 * @param phoneNum
	 * @param date
	 * @param line
	 * @return String
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
	 * Function to read the json file
	 * 
	 * @param filename
	 *            the path where the json file is present
	 * @return string
	 * @throws IOException
	 */
	public static String readJsonFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String line = "";
		while ((line = br.readLine()) != null) {
			str += line;
		}
		br.close();
		return str;
	}

	public static Inventory insertData() {
		Inventory inventory = new Inventory();
		System.out.println("Enter the name:");
		inventory.setName(userString());
		System.out.println("Enter the weight");
		inventory.setWeight(userFloat());
		System.out.println("Enter the price");
		inventory.setPrice(userDouble());
		return inventory;
	}

	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}

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

	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}
}
