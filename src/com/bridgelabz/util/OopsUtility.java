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
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner s=new Scanner(System.in);

	static ObjectMapper objectMapper=new ObjectMapper();
	
	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int userInt(){
			return s.nextInt();
	}
	
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double userDouble(){
			return s.nextDouble();
	}
	
	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
			return s.nextBoolean();
	}
	
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String userString(){
			return s.next();
	}
	
	public static float userFloat(){
		return s.nextFloat();
	}
	
	public static long userLong(){
		return s.nextLong();
	}
	
	public static <T> List<T> userReadValue(String str, Class<?> clazz) throws JsonParseException, JsonMappingException, IOException{
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}
	
	public static <T> String userWriteValueAsString(List<T> list) throws JsonGenerationException, JsonMappingException, IOException{
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
	public static String replace(String first,String fullName,String phoneNum,String date,String line) {
        final  String REGEX_NAME = "<{2}+\\w+>{2}";
        final  String REGEX_FULL_NAME = "<{2}+\\w+ +\\w+>{2}";
        final  String REGEX_CONTACT = "x{10}";
        final  String REGEX_DATE = "<{2}+\\d{2}+/+\\d{2}+/+\\d{4}+>{2}";
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
	 * @param filename the path where the json file is present
	 * @return string 
	 * @throws IOException 
	 */
	public static String readJsonFile(String filename) throws IOException{
		FileReader fr=new FileReader(filename);
		BufferedReader br=new BufferedReader(fr);
		String str ="";
		String line = "";
		while((line=br.readLine())!=null){
			str+=line;
		}
		br.close();
		return str;
	}
	
	public static Inventory insertData(){
		Inventory inventory=new Inventory();
		System.out.println("Enter the name:");
		inventory.setName(userString());
		System.out.println("Enter the weight");
		inventory.setWeight(userFloat());
		System.out.println("Enter the price");
		inventory.setPrice(userDouble());
		return inventory;
	}
	
	public static void writeFile(String json,String filename) throws IOException {
		FileWriter fw=new FileWriter(filename);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	 }
	
	 public static void calulatePrice(List<InventoryList> list){  
		 for (int i = 0; i < list.size(); i++) {
			 double sum=0;
			 InventoryList inList = list.get(i);
			 System.out.println("Inventory name :" + inList.getInventoryName());
			 for (int j = 0; j < inList.getListofInventories().size(); j++) {
				 sum+=inList.getListofInventories().get(j).getPrice();
			 }	
			 System.out.println("total price to be given is :"+sum);
			 System.out.println("---------------------------------------------");
		 }
	 }
	 
}
