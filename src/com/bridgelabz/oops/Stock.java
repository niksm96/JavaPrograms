package com.bridgelabz.oops;

public class Stock {
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	
	public Stock(){
		stockName=null;
		noOfShares=0;
		sharePrice=0f;
	}

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
