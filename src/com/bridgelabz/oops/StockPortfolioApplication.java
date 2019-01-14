package com.bridgelabz.oops;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class StockPortfolioApplication {
	public static void main(String[] args) throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter-- 1:Add Stock  2:Calculate each stock value  3:Calculate value of total stocks  4:Display  5:Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				StockPortfolio.addStock();
				isRunning = true;
				break;
			case 2:
				StockPortfolio.valueOfEachShare();
				isRunning=true;
				break;
			case 3:
				StockPortfolio.valueOfTotalStocks();
				isRunning=true;
				break;
			case 4:
				StockPortfolio.displayStockDetails();
				isRunning=true;
				break;
			default:
				System.out.println("Invalid choice");
				isRunning = false;
				break;
			}
		}
	}
}
