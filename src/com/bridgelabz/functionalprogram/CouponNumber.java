/******************************************************************************
 *  Compilation:  javac -d bin CouponNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.CouponNumber 
 *  
 *  Purpose: Generates distinct coupon number and number of 
 *  		 random number required to get distinct coupon numbers
 *  
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.FunctionalUtilty;

public class CouponNumber {

	/*
	* The main function is written to take input from the user and
	* calls couponNumber function that generates distinct coupon
	*  numbers
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of coupons to be generated");
		
		//Reading input number from the user
		int num=FunctionalUtilty.userInt();
		
		//Method 1- using non-static function of FunctionalUtilty class
		//of com.bridgelabz.util package
		int res=FunctionalUtilty.couponNumber(num);
		
		System.out.println("Number of random numbers needed:"+ res);
		
	}
}
