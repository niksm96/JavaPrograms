package com.bridgelabz.util;
import com.bridgelabz.functionalprogram.*;
import java.util.Scanner;
import java.util.Random;

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
		Random r=new Random();
		int head=0,tail=0;
		int num=n;
		while(n > 0) 
		{
				int rand=r.nextInt(2);
				if (rand==0)
					tail++;
				else 
					head++;
				n--;
		}
		//System.out.println(tail+ "hai "+head);
		double per_tail = (tail*100/ num);
		double per_head = (head*100/ num);
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
		int count=0;
		if(n>=0 && n<31){
			for(int i=n;i>=0;i--){
				System.out.println(Math.pow(2,count));
				count++;
			}
		}
		else
			System.out.println("The value of n should be in the range of 0 to 31");
	}
	
	public void harmonicValue(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0;
		do{
			for(double i=1;i<=n;i++){
				sum=sum+(1/i);
			}
		}while(n!=0);
			System.out.println(sum);
			s.close();
	}
	
	public void primeFactor(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i*i<=n;i++){
			
		}
	}
}
