package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bridgelabz.util.OopsUtility;

public class Regex {
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
//	        System.out.println("Please enter date in the format DD/MM/YYYY");
//	        String date=OopsUtility.userString();
	        Date date=new Date();
	        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        String formattedDate= dateFormat. format(date);
	        String message = OopsUtility.replace(firstName, fullName, phoneNum, formattedDate, line);
	        System.out.println(message);
	}
}
