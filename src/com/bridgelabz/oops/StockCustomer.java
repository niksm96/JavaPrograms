package com.bridgelabz.oops;

public class StockCustomer {
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	private Transaction transaction=new Transaction();

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
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}
