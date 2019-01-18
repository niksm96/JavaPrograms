package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.ApplicationUtility;
import com.bridgelabz.util.OopsUtility;

public class Regex {
	
	/*
	* The main function is written to take input from the user and
	* replace the template in the json file with the input given
	*/
	public static void main(String[] args) throws FileNotFoundException {
		 String str = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\regexText.txt";
	        FileReader f = new FileReader(str);
	        @SuppressWarnings("resource")
	        BufferedReader read = new BufferedReader(f);
	        String line = "";
	        String word="";
	        try {
	            while ((word = read.readLine()) != null) {
	                line = word;
	            }
	            System.out.println(line);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println("Please enter the first name");
	        String firstName = OopsUtility.userString();
	        System.out.println("Please enter the last name");
	        String lastName = OopsUtility.userString();
	        String fullName = firstName + " " + lastName;
	        System.out.println("Please enter your 10 digit phone number");
	        String phoneNum = OopsUtility.userString();
	        Date date=new Date();
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedDate= dateFormat. format(date);
	        
	        //Method 1- using non-static function of Regex class
			//of com.bridgelabz.oops package
	        String message =ApplicationUtility.replace(firstName, fullName, phoneNum, formattedDate, line);
	        
	        System.out.println(message);
	}
}
