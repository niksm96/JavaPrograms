/******************************************************************************
 *  Compilation:  javac -d bin Calendar.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.Calendar n
 *  
 *  Purpose: ­> Takes the month and year as command­line arguments and 
 *  			prints the Calendar of the month.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtilty;

public class Calender {
	
	/*
	* The main function is written to take input from the user
	* and print the calendar
	*/
	public static void main(String[] args) {
		 int month =Integer.parseInt(args[0]);
		 int year =Integer.parseInt(args[1]);
		 String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				 "October", "November", "December" };
		 int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 
		 //Method 1- using function of FunctionalUtility class of
		 //com.bridgelabz.util package
		 if (month == 2 && FunctionalUtilty.leapYear(year))
			 days[month] = 29;
		 System.out.println("\t\t " + months[month] + " " + year);
		 System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		 
		//Method 2- using function of AlgorithmUtility class of
		//com.bridgelabz.util package
		 int d = AlgorithmUtility.dayOfWeek(month, 1, year);
		 
		 for (int i = 0; i < d; i++)
			 System.out.print("\t");
		 for (int i = 1; i <= days[month]; i++) {
			 System.out.print(i + "\t");
			 if (((i + d) % 7 == 0) || (i == days[month]))
				 System.out.println();
		 }
	}
}
