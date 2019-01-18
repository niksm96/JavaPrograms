/******************************************************************************
 *  Compilation:  javac -d bin Stock.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Stock.java n
 *  
 *  Purpose: Creates a plain old java object to achieve encapsulation and for
 *  		 reusability of the code
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   14-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

public class Stock {
	
	private String stockName;
	private int noOfShares;
	private float sharePrice;

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

}
