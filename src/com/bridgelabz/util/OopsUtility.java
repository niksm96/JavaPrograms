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
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopsUtility {
	
	/**
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner s=new Scanner(System.in);

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
        final  String REGEX_NAME = "<<name>>";
        final  String REGEX_FULL_NAME = "<<full name>>";
        final  String REGEX_CONTACT = "xxxxxxxxxx";
        final  String REGEX_DATE = "<<XX/XX/XXXX>>";
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
	
}
