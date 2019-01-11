package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class AddressBookApplication {
	public static void main(String[] args) throws IOException {
		AddressBookManager addBookMan = new AddressBookManager();
		int press = 1;
		while (press == 1) {
			System.out.println("Enter your choice");
			System.out.println("1:Create Book  2:Open Book  3:Save Book  4:Save As  5:Close Book  6:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				addBookMan.createBook();
				break;
			case 2:
				addBookMan.openBook();
				break;
			case 6:
				System.out.println("Invalid choice");
				System.exit(0);

			}
			System.out.println("Do you want to continue? if yes press 1 else 0");
			press=OopsUtility.userInt();
		}
	}
}
