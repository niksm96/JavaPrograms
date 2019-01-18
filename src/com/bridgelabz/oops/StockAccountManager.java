/******************************************************************************
 *  Compilation:  javac -d bin StockAccountManager.java
 *  Execution:    java -cp bin com.bridgelabz.oops.StockAccountManager.java n
 *  
 *  Purpose: This application is to manage stock account of the share holders
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   12-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class StockAccountManager {
	
	/*
	* The main function is written to take input from the user and
	* calls various methods that manages the stocks of the share holders
	*/
	public static void main(String[] args) throws IOException {
		int noOfStocks = StockPortfolio.noOfShares();
		System.out.println("Checking if stocks are available...");
		if (noOfStocks > 0) {
			System.out.println("Stocks are available!");
			int num=0;
			do{
				System.out.println("Enter the choice- "
						+ "(If you're new) 1-Create Account (If you're regular) 2-Open Account  3-Quit");
				int choice = OopsUtility.userInt();
				switch (choice) {
				case 1:
					
					//Method 1- using non-static function of StockAccount class
					//of com.bridgelabz.oops package
					StockAccount.creatAccount();
					
					break;
				case 2:
					
					//Method 2- using non-static function of StockAccount class
					//of com.bridgelabz.oops package
					StockAccount.openAccount();
					
					break;
				default:
					System.out.println("Invalid choice");
					break;

				}
			}while(num<1);
		}
		else{
			System.out.println("We are out of stocks today");
		}
	}
}
