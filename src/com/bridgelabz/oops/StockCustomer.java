/******************************************************************************
 *  Compilation:  javac -d bin StockCustomer.java
 *  Execution:    java -cp bin com.bridgelabz.oops.StockCustomer.java n
 *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   10-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

public class StockCustomer {
	
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	private Transaction transaction;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public float getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}
