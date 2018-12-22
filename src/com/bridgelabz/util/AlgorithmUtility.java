/******************************************************************************
 *  Compilation:  javac -d bin AlgorithmUtility.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.algorithmprogram package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

import com.bridgelabz.algorithmprogram.*;
import java.util.*;
public class AlgorithmUtility{
	
	public static boolean isAnagram(String str1,String str2) {
		char[] n_str1=str1.toLowerCase().toCharArray();
		char[] n_str2=str2.toLowerCase().toCharArray();
		int len1=n_str1.length;
		int len2=n_str2.length;
		if(len1!=len2) {
			return false;
		}
		else{
			Arrays.sort(n_str1);
			Arrays.sort(n_str2);
			for(int i=0;i<len1;i++){
				if(n_str1[i]==n_str2[i])
					return true;
				
			}
			return false;
		}	
	}
	
	public static void primeNumbers(int m,int n) {
		int temp;
		if(m>n) {
			temp=m;
			m=n;
			n=temp;
		}
		int flag=1;
		for(int i=m;i<=n;i++){
			for(int j=2;j<i;j++){
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				System.out.print(i + " ");
			}
		}
	}
	
	public static void bubbleSort(int[] array,int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array are:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static String[] insertionSort(String[] str_array,int num) {
		String temp;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(str_array[i].compareTo(str_array[j])>0) {
					temp=str_array[i];
					str_array[i]=str_array[j];
					str_array[j]=temp;
				}
			}
		}
		return str_array;
	}
	
	public static void vendingMachine(int[] notes,int amt) {
		int cash=amt;
		int temp=0;
		for(int i=0;i<notes.length;i++)
		{
			int count=0;
			if(notes[i]<=cash)
			{
			count=cash/notes[i];
			cash=cash%notes[i];
			temp+=count;
			}
			if(count>0)
			{  
				System.out.println(notes[i]+"x"+count);
				
			}
		}
		System.out.println("The minimum notes required is:"+temp);
	}
	
	public static void temperatureConversion(int choice,double temp) {
		double f_temp,c_temp;
		switch(choice){
			case 1: System.out.println("Your input is in celcius");
			 		f_temp=(temp*(9/5))+32;
			 		System.out.println("The fahrenheit temp for your temp: "+f_temp);
			 		break;
			 		
			case 2: System.out.println("Your input is in celcius");
	 				c_temp=(temp-32)*(5/9);
	 				System.out.println("The fahrenheit temp for your temp: "+c_temp);
	 				break;
	 				
	 		default: System.out.println("Invalid choice");
	 				 break;
		}
	}
	
	public static double monthlyPayment(int principle,int year,double rate) {
		int num=12*year;
		double rt=(rate)/(12*100);
		return (principle*rt)/(1-Math.pow(1+rt, -num));
		
	}
	
	public static void squareRoot(double num) {
		double temp=num;
		double epsilon=1e-15;
		if(num>0) {
			while(Math.abs(temp-num/temp)> epsilon*temp) {
			temp=(num/temp+temp)/2;
			}
		}
		System.out.println("The square root of the given number using Newton's Method is: "+ temp);
	}
	
	public static String toBinary(int num) {
		String bin=" ";
		int rem;
		do{
			rem=num%2;
			bin=rem+bin;
			num=num/2;
		}while(num!=0);
		return bin;
	}
	
	public static int dayOfWeek(int month,int date,int year) {
		int year1=year-(14-month)/12;
		int x=year1+(year1/4)-(year1/100)+(year1/400);
		int month1=month+12*((14-month)/12)-2;
		int date1=(date+x+(31*month1)/12)%7;
		return date1;
	}
	
	public static void bubbleSortGeneric(String[] array) {
		String temp;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void insertionSortGeneric(String[] array,int num) {
		String temp;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(array[i].compareTo(array[j])>0) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("The sorted array are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
