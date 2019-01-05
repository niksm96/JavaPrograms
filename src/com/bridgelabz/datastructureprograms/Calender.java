package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtilty;

public class Calender {
	public static void main(String[] args) {
		 int month =Integer.parseInt(args[0]);
		 int year =Integer.parseInt(args[1]);
		 String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				 "October", "November", "December" };
		 int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 if (month == 2 && FunctionalUtilty.leapYear(year))
			 days[month] = 29;
		 System.out.println("\t\t " + months[month] + " " + year);
		 System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
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
