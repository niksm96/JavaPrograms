/******************************************************************************
 *  Compilation:  javac -d bin StockPortfolioApplication.java
 *  Execution:    java -cp bin com.bridgelabz.oops.StockPortfolioApplication.java n
 *  
 *  Purpose: This application is to manage stocks
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   12-01-2018
 *
 ******************************************************************************/


package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

/*
* The main function is written to take input from the user and
* calls various methods that manages the stocks
*/
public class StockPortfolioApplication {
	public static void main(String[] args) throws IOException {
		int flag=0;
		do {
			System.out.println("Enter-- 1:Add Stock  2:Calculate each stock value  3:Calculate value of total stocks  4:Display  5:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				
				//Method 1- using non-static function of StockPortfolio class
				//of com.bridgelabz.oops package
				StockPortfolio.addStock();
				
				break;
			case 2:
				
				//Method 2- using non-static function of StockPortfolio class
				//of com.bridgelabz.oops package
				StockPortfolio.valueOfEachShare();
				
				break;
			case 3:
				
				//Method 3- using non-static function of StockPortfolioclass
				//of com.bridgelabz.oops package
				StockPortfolio.valueOfTotalStocks();
				
				break;
			case 4:
				
				//Method 4- using non-static function of StockPortfolio class
				//of com.bridgelabz.oops package
				StockPortfolio.displayStockDetails();
			
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}while(flag<1);
	}
}
