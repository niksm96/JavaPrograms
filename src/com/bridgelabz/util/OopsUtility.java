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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class OopsUtility {

	/**
	 * static object is created for Scanner class to avoid multiple object
	 * creations of the same class.
	 */
	private static Scanner s = new Scanner(System.in);

	/**
	 * static object is created for ObjectMapper class to avoid multiple object
	 * creations of the same class
	 */
	private static ObjectMapper objectMapper = new ObjectMapper();

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
	
	/**
	 * Static Function to map the json string to the list of objects
	 * 
	 * @param str the string obtained from the json file
	 * @param clazz the class that contains the object whose list is formed 
	 * @return the list of the object 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> List<T> userReadValue(String str, Class<?> clazz)
			throws JsonParseException, JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

	/**
	 * Static Function to map the list to json string
	 * 
	 * @param list the list to be converted to json string
	 * @return string the string is json
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public static <T> String userWriteValueAsString(List<T> list)
			throws JsonGenerationException, JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}

	

	/**
	 * Function to read the json file
	 * 
	 * @param filename the path where the json file is present
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
	
	/**
	 * Function to write on to file
	 * @param json 
	 * @param filename
	 * @throws IOException
	 */
	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}
	
	public static <T> void writeToFile(String filename,List<T> list) throws JsonGenerationException, JsonMappingException, IOException {
		String jsonString = userWriteValueAsString(list);
		writeFile(jsonString, filename);
	}
	
}
