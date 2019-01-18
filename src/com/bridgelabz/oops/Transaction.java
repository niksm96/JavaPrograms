/******************************************************************************
 *  Compilation:  javac -d bin Transaction.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Transaction.java n
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

public class Transaction {
	private String date;
	private String transactionStatus;

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	
}
