package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManagementApplication {
	public static void main(String[] args) throws IOException, JsonMappingException,JsonParseException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Take Appointment  4:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				CliniqueManager.add();
				isRunning = true;
				break;
			case 2:
				CliniqueManager.search();
				isRunning = true;
				break;
			default:
				System.out.println("Invalid choice");
				isRunning = false;
				break;
			}
		}
	}
}