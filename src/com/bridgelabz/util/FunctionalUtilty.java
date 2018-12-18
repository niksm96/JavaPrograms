package com.bridgelabz.util;
import com.bridgelabz.functionalprogram.*;
import java.util.Scanner;

public class FunctionalUtilty {
	public void replaceString(String str) {
		Scanner s = new Scanner(System.in);
		String uname = s.nextLine();
		if (uname.length() >= 3) {
			String rString = str.replace("<<UserName>>", uname);
			System.out.println(rString);
		} else {
			System.out.println("Username should be above 3 min characters");
		}
		s.close();
	}

	public void perHeadTail() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double tail, head, sum_tail = 0, sum_head = 0;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				double rand = Math.random();
				if (rand < 0.5) {
					tail = rand;
					sum_tail += tail;
				} else {
					head = rand;
					sum_head += head;
				}
			}
		}
		double per_tail = (sum_tail / n) * 100;
		double per_head = (sum_head / n) * 100;
		System.out.println("Head Vs Tail: " + per_head + ":" + per_tail);
		s.close();
	}

	public void leapYear() {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if (String.valueOf(year).length() == 4) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				System.out.println(year + "  is a leap year");
			else
				System.out.println(year + "  is not a leap year");
		} else
			System.out.println("Year should be of 4 digits");
		s.close();
	}
	
	public void powerOf2(int n){
		
	}
}
