/******************************************************************************
 *  Compilation:  javac -d bin StockAccount.java
 *  Execution:    java -cp bin com.bridgelabz.oops.StockAccount.java n
 *  
 *  Purpose: This application is to manage stock account of the share holders
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   12-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.ApplicationUtility;
import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Queue;
import com.bridgelabz.util.StackLinkedList;

public class StockAccount {
	static final String path = "/home/admin1/Documents/Nikitha_Project/JavaPrograms/";

	static String chooseAccount;
	static List<StockCustomer> listOfStocks = new ArrayList<>();
	static Queue<String> queue = new Queue<>();
	static StackLinkedList<String> stack = new StackLinkedList<>();
	static StackLinkedList<String> temStack = new StackLinkedList<>();
	static CustomLinkedList<String> linkedList = new CustomLinkedList<>();

	/**
	 * Static function to create a account
	 * 
	 * @throws IOException
	 */
	public static void creatAccount() throws IOException {
		System.out.println("Enter your name");
		String name = OopsUtility.userString();
		File file = new File(path + name + ".json");
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("Account is created");
		} else {
			System.out.println("Account of that name already exists");
		}
	}

	/**
	 * Static function to open account of a share holder
	 * 
	 * @throws IOException
	 */
	public static void openAccount() throws IOException {
		System.out.println("Accounts available are:");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the account");
		chooseAccount = OopsUtility.userString();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (chooseAccount.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Account is not empty");
					String string = OopsUtility.readJsonFile(filename);
					listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);

					// Function that performs various operations after opening the account
					stockOperation();

				} else {
					System.out.println("Account has no data");
					stockOperation();
				}
			}
		}
	}

	/**
	 * Static function to read from the file and call the function to buy stock
	 * 
	 * @throws IOException
	 */
	public static void buyStock() throws IOException {
		System.out.println("These are the stocks available:");

		// Static function that displays the stock details that are available
		StockPortfolio.displayStockDetails();

		System.out.println("Enter the stock name you wish to buy");
		String stockName = OopsUtility.userString();
		System.out.println("Enter the number of shares you want to buy");
		int noOfShares = OopsUtility.userInt();
		String string1 = OopsUtility.readJsonFile(path + chooseAccount);
		String string = OopsUtility.readJsonFile(StockPortfolio.stockFile);
		StockPortfolio.listOfStock = OopsUtility.userReadValue(string, Stock.class);
		try {
			listOfStocks = OopsUtility.userReadValue(string1, StockCustomer.class);

			// Function that buys stock
			StockCustomer stockCustomer = newData(stockName, noOfShares);

			listOfStocks.add(stockCustomer);
		} catch (Exception e) {
			StockCustomer stockCustomer = newData(stockName, noOfShares);
			listOfStocks.add(stockCustomer);
		}
		String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
		OopsUtility.writeFile(json, StockPortfolio.stockFile);
	}

	/**
	 * Static function that buys the stock
	 * 
	 * @param stockName  the name of stock to be bought
	 * @param noOfShares the number of shares the customer wishes to buy
	 * @return object of STockCustomer class
	 */
	public static StockCustomer newData(String stockName, int noOfShares) {
		for (Stock stock : StockPortfolio.listOfStock) {
			if (stockName.equals(stock.getStockName())) {
				int numOfShares = stock.getNoOfShares() - noOfShares;
				stock.setNoOfShares(numOfShares);
				float price=stock.getSharePrice();
				StockCustomer newStock=newCustomer(stockName, numOfShares, price);
				return newStock;
			}
		}
		return null;
	}

	/**
	 * Static function to write the details of the transaction of an account holder
	 * onto the json file
	 */
	public static void saveStock() {
		System.out.println("Saving " + chooseAccount + " account");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (chooseAccount.equals(filename)) {
				try {
					String json = OopsUtility.userWriteValueAsString(listOfStocks);
					OopsUtility.writeFile(json, filename);
					System.out.println("Account details saved");
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
	}

	/**
	 * Static Function to display the account details
	 * 
	 * @throws IOException
	 */
	public static void displayStockAccount() throws IOException {
		String string = OopsUtility.readJsonFile(path + chooseAccount);
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (chooseAccount.equals(filename)) {
				try {
					listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
					System.out.println("Displaying " + chooseAccount + "  account");
					for (StockCustomer stock : listOfStocks) {
						System.out.println("Stock Name: " + stock.getStockName());
						System.out.println("Number of Shares: " + stock.getNoOfShares());
						System.out.println("Share price: " + stock.getSharePrice());
						System.out.println("Transaction date: " + stock.getTransaction().getDate());
						System.out.println("Transaction status: " + stock.getTransaction().getTransactionStatus());
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Empty!");
				}
			}
		}
	}

	/**
	 * Static function to call the function that sells the stock
	 * 
	 * @throws IOException
	 */
	public static void sellStock() throws IOException {
		displayStockAccount();
		System.out.println("Enter the name of the stock you wish to sell");
		String stockName = OopsUtility.userString();
		System.out.println("Enter the number of shares you wish to sell");
		int numOfShares = OopsUtility.userInt();
		String string = OopsUtility.readJsonFile(path + chooseAccount);

		try {
			listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);

			// Static function call to sell the stock
			StockCustomer newStock = newSoldData(stockName, numOfShares);

			listOfStocks.add(newStock);

			// Function call to update the number of shares in the stock file
			Stock stock=updateStock(stockName, numOfShares);
			StockPortfolio.listOfStock.add(stock);
			String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
			OopsUtility.writeFile(json, StockPortfolio.stockFile);

		} catch (Exception e) {
			System.out.println("Buy stock before selling it");
		}

	}

	/**
	 * Static function to update the stock file
	 * 
	 * @param stockName  the name of the stock the customer wishes to sell
	 * @param noOfShares the number of shares he wishes to sell
	 * 
	 * @throws IOException
	 */
	public static Stock updateStock(String stockName, int noOfShares) throws IOException {
		String string1 = OopsUtility.readJsonFile(StockPortfolio.stockFile);
		StockPortfolio.listOfStock = OopsUtility.userReadValue(string1, Stock.class);
		for (Stock stock : StockPortfolio.listOfStock) {
			if (stockName.equals(stock.getStockName())) {
				int newNum = stock.getNoOfShares() + noOfShares;
				stock.setNoOfShares(newNum);
				return stock;
			}
		}

		return null;
	}

	/**
	 * Static function to sell the stock
	 * 
	 * @param stockName   the name of the stock the customer wishes to sell
	 * @param numOfShares the number of shares the customer wishes to sell
	 * @return the object of the StockCustomer class
	 */
	public static StockCustomer newSoldData(String stockName, int numOfShares) {
		for (StockCustomer stock : listOfStocks) {
			if (stockName.equals(stock.getStockName())) {
				float price=stock.getSharePrice();
				StockCustomer newStock=newCustomer(stockName, numOfShares, price);
				return newStock;
			}
		}
		return null;

	}

	/**
	 * Static funtion to set the new details of the customer 
	 * @param stockName
	 * @param numOfShares
	 * @param price
	 * @return
	 */
	public static StockCustomer newCustomer(String stockName,int numOfShares,float price) {
		StockCustomer newStock = new StockCustomer();
		newStock.setStockName(stockName);
		newStock.setNoOfShares(numOfShares);
		newStock.setSharePrice(price);
		Transaction transaction = new Transaction();
		String date = ApplicationUtility.getDate();
		transaction.setDate(date);
		transaction.setTransactionStatus("Sold");
		newStock.setTransaction(transaction);
		return newStock;
	}
	/**
	 * Static function to perform operations like buying and selling stock
	 * 
	 * @throws IOException
	 */
	public static void stockOperation() throws IOException {
		int num=0;
		do {
			System.out.println("Enter choice: 1-Buy Stock  2-Sell Stock  3-Save Stock  4-Print Report  5-Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				buyStock();
				break;
			case 2:
				sellStock();
				break;
			case 3:
				saveStock();
				break;
			case 4:
				printReport();
				break;
			default:
				System.out.println("Invalid choice");
				System.exit(0);
				break;
			}
		} while (num<1);
	}

	/**
	 * Static function to add the stock name, date and transaction status into
	 * linked list,queue and stack respectively
	 * 
	 * @throws IOException
	 */
	public static void addPrintReport() throws IOException {
		String string = OopsUtility.readJsonFile(path + chooseAccount);
		try {
			listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
			for (StockCustomer stockCustomer : listOfStocks) {
				linkedList.add(stockCustomer.getStockName());
				queue.insert(stockCustomer.getTransaction().getDate());
				stack.push(stockCustomer.getTransaction().getTransactionStatus());
			}
		} catch (Exception e) {
			System.out.println("File is empty");
		}
	}

	/**
	 * Static Function to print the report
	 * 
	 * @throws IOException
	 */
	public static void printReport() throws IOException {
		addPrintReport();
		System.out.println("----Stock Purchase and Sold Details---");
		System.out.print("Stock Name : ");
		linkedList.getLinkedList();
		System.out.println();
		System.out.print("Date       : ");
		for (int i = 0; i < queue.getSize(); i++) {
			System.out.print(queue.remove() + "\t");
		}
		System.out.println();
		while (!stack.isEmpty()) {
			temStack.push(stack.pop());
		}
		System.out.print("Status     : ");
		while (!temStack.isEmpty()) {
			System.out.print(temStack.pop() + "\t\t\t");
		}
		System.out.println("----------------------------------------------------");
	}
}