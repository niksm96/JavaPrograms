package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class StockAccountManager {
	public static void main(String[] args) throws IOException {
		int noOfStocks = StockPortfolio.noOfShares();
		System.out.println("Checking if stocks are available...");
		if (noOfStocks > 0) {
			System.out.println("Stocks are available!");
			boolean isRunning = true;
			while (isRunning) {
				System.out.println("Enter the choice- "
						+ "(If you're new) 1-Create Account (If you're regular) 2-Open Account  3-Quit");
				int choice = OopsUtility.userInt();
				switch (choice) {
				case 1:
					StockAccount.creatAccount();
					isRunning = true;
					break;
				case 2:
					StockAccount.openAccount();
					isRunning = true;
					break;
				default:
					System.out.println("Invalid choice");
					isRunning=false;
					break;

				}
			}
		}
		else{
			System.out.println("We are out of stocks today");
		}
	}
}
