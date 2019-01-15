package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class StockAccount {
	static String path = "E:\\BridgeLabz\\JavaPrograms\\";
	static File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	static String chooseAccount;
	static List<StockCustomer> listOfStocks = new ArrayList<>();

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

	public static void openAccount() throws IOException {
		System.out.println("Accounts available are:");
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
					stockOperation();
				} else {
					System.out.println("Account has no data");
					stockOperation();
				}
			}
		}
	}

	public static void buyStock() throws IOException {
		System.out.println("These are the stocks available:");
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
			StockCustomer stockCustomer=newData(stockName, noOfShares);
			listOfStocks.add(stockCustomer);
		} catch (Exception e) {
			StockCustomer stockCustomer=newData(stockName, noOfShares);
			listOfStocks.add(stockCustomer);
		}
		String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
		OopsUtility.writeFile(json, StockPortfolio.stockFile);
	}

	public static StockCustomer newData(String stockName, int noOfShares) {
		for (Stock stock : StockPortfolio.listOfStock) {
			if (stockName.equals(stock.getStockName())) {
				int numOfShares = stock.getNoOfShares() - noOfShares;
				stock.setNoOfShares(numOfShares);
				StockCustomer stockCustomer = new StockCustomer();
				stockCustomer.setStockName(stockName);
				stockCustomer.setNoOfShares(noOfShares);
				stockCustomer.setSharePrice(stock.getSharePrice());
				Transaction transaction = new Transaction();
				String date = OopsUtility.getDate();
				transaction.setDate(date);
				transaction.setTransactionStatus("Purchase");
				stockCustomer.setTransaction(transaction);
				return stockCustomer;
			}
		}
		return null;
	}

	public static void saveStock() {
		System.out.println("Saving " + chooseAccount + " account");
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

	public static void displayStockAccount() throws IOException {
		String string = OopsUtility.readJsonFile(path + chooseAccount);
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
						System.out.println("Transaction: " + stock.getTransaction().toString());
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Empty!");
				}
			}
		}
	}

	public static void sellStock() throws IOException {
		displayStockAccount();
		System.out.println("Enter the stock name you wish to sell");
		String stockName = OopsUtility.userString();
		System.out.println("Enter the number of shares you wish to sell");
		int noOfShares = OopsUtility.userInt();
		String string = OopsUtility.readJsonFile(path + chooseAccount);
		String string1 = OopsUtility.readJsonFile(StockPortfolio.stockFile);
		try {
			listOfStocks = OopsUtility.userReadValue(string, StockCustomer.class);
			for (StockCustomer stock : listOfStocks) {
				if (stockName.equals(stock.getStockName())) {
					StockCustomer newStock = new StockCustomer();
					newStock.setStockName(stockName);
					int newNoOfShares = stock.getNoOfShares() - noOfShares;
					newStock.setNoOfShares(newNoOfShares);
					newStock.setSharePrice(stock.getSharePrice());
					Transaction transaction = new Transaction();
					String date = OopsUtility.getDate();
					transaction.setDate(date);
					transaction.setTransactionStatus("Sold");
					newStock.setTransaction(transaction);
					listOfStocks.add(newStock);
				}
			}
			StockPortfolio.listOfStock = OopsUtility.userReadValue(string1, Stock.class);
			for (Stock stock : StockPortfolio.listOfStock) {
				if (stockName.equals(stock.getStockName())) {
					int newShares = stock.getNoOfShares() + noOfShares;
					stock.setNoOfShares(newShares);
				}
			}
			String json = OopsUtility.userWriteValueAsString(StockPortfolio.listOfStock);
			OopsUtility.writeFile(json, StockPortfolio.stockFile);
		} catch (Exception e) {
			System.out.println("Add stock before you sell it");
		}
	}

	public static void stockOperation() throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter choice: 1-Buy Stock  2-Sell Stock  3-Save Stock  4-Print Report  5-Quit");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				buyStock();
				isRunning = true;
				break;
			case 2:
				sellStock();
				isRunning = true;
				break;
			case 3:
				saveStock();
				isRunning = true;
				break;
			case 4:
				displayStockAccount();
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