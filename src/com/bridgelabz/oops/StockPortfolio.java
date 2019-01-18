/******************************************************************************
 *  Compilation:  javac -d bin StockPortfolio.java
 *  Execution:    java -cp bin com.bridgelabz.oops.StockPortfolio.java n
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
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class StockPortfolio {
	static List<Stock> listOfStock = new ArrayList<>();
	static final String stockFile = "/home/admin1/Documents/Nikitha_Project/JavaPrograms/src/com/bridgelabz/oops/Stock.json";

	/**
	 * Static function to add stock 
	 * 
	 * @throws IOException
	 */
	public static void addStock() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		Stock stock = new Stock();
		System.out.println("Enter the stock name");
		stock.setStockName(OopsUtility.userString());
		System.out.println("Enter the number of stock");
		stock.setNoOfShares(OopsUtility.userInt());
		System.out.println("Enter the price for per share");
		stock.setSharePrice(OopsUtility.userFloat());
		listOfStock.add(stock);
		String json = OopsUtility.userWriteValueAsString(listOfStock);
		OopsUtility.writeFile(json, stockFile);
	}

	/**
	 * Static function to calculate each value of stock
	 * 
	 * @throws IOException
	 */
	public static void valueOfEachShare() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		float valueOfEachShare;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				valueOfEachShare = stock.getNoOfShares() * stock.getSharePrice();
				System.out.println("Value of each stock: " + valueOfEachShare);
				System.out.println("----------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	/**
	 * Static function to calculate the value of total sales
	 * @throws IOException
	 */
	public static void valueOfTotalStocks() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		double totalStockValue = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				totalStockValue += (stock.getNoOfShares() * stock.getSharePrice());
			}
			System.out.println("Value of Total Stock: " + totalStockValue);
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	/**
	 * Static function to display the stock details
	 * 
	 * @throws IOException
	 */
	public static void displayStockDetails() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				System.out.println("Stock Name: " + stock.getStockName());
				System.out.println("Number of Shares: " + stock.getNoOfShares());
				System.out.println("Share price :" + stock.getSharePrice());
				System.out.println("------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
	}

	/**
	 * Static function to calculate the number of stocks present 
	 * 
	 * @return the number of stocks
	 * 
	 * @throws IOException
	 */
	public static int noOfShares() throws IOException {
		String string = OopsUtility.readJsonFile(stockFile);
		int sum = 0;
		try {
			listOfStock = OopsUtility.userReadValue(string, Stock.class);
			System.out.println("File is not empty!");
			for (Stock stock : listOfStock) {
				sum += stock.getNoOfShares();
			}
			return sum;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return 0;
		}
	}
}
