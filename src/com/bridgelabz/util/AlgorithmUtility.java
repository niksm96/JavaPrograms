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
import java.util.Scanner;
import java.util.Arrays;

public class AlgorithmUtility{
	
	static Scanner s=new Scanner(System.in);

	public static int userInt(){
		try{
			return s.nextInt();
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public static double userDouble(){
		try{
			return s.nextDouble();
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public static boolean userBoolean(){
		try{
			return s.nextBoolean();
		}catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public static String userString(){
		try{
			return s.next();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
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
			str1=String.valueOf(n_str1);
			str2=String.valueOf(n_str2);
			if(str1.equals(n_str2))
				return true;
			else
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
	
	public static void insertionSort(String[] array,int num) {
		String temp;
		for(int i=1;i<num;i++) {
			temp=array[i];
			int j;
			j=i-1;
			while(j>=0 && array[j].compareTo(temp)>0){
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=temp;
		}
		System.out.println("The sorted array are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
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
	
	//Methods for SSPerformance.java 
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
		for(int i=1;i<num;i++) {
			temp=array[i];
			int j;
			j=i-1;
			while(j>=0 && array[j].compareTo(temp)>0){
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=temp;
		}
		System.out.println("The sorted array are:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySearchGeneric(String[] array,String key){
		int low=0,high=array.length-1;
		sort(array);
		int mid=(high+low)/2;
		while(low<=high){
			
			if((key.compareTo(array[mid]))==0)
			{
				return mid;
			}
			else if((array[mid].compareTo(key))>0)
				 high=mid-1;
			else
				low=mid+1;
			mid=(low+high)/2;
		}
		return -1;
	}
	
	public static void mergeSort(String[] array,int low,int high){
		int mid;
		if(low<high){
			mid=(high+low)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
		    merge(array,low,mid,high);
		}
	}
	
	public static void merge(String[] array,int low,int mid,int high){
		int n1=mid-low+1;
		int n2=high-mid;
		String[] first_sub=new String[n1];
		String[] second_sub=new String[n2];
		for(int i=0;i<n1;i++){
			first_sub[i]=array[i+low];
		}
		for(int i=0;i<n2;i++){
			second_sub[i]=array[mid+1+i];
		}
		int i=0,j=0,k=0;
		while(i<n1 && j<n2){
			if(first_sub[i].compareTo(second_sub[j])<=0){
				array[k]=first_sub[i];
				i++;
			}
			else{
				array[k]=second_sub[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			array[k]=first_sub[i];
			i++;
			k++;
		}
		while(j<n2){
			array[k]=second_sub[j];
			j++;
			k++;
		}
	}
	
	public static void print(String [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public static int findNumber(int low,int high){
		int mid=(low+high)/2;
		if((high-low)==1){
			System.out.println("Is your number lesser than or equal to "+mid+"? then type true else type false");
			boolean b=userBoolean();
			if(b==true)
				return low;
			else
				return high;
		}
		do{
			System.out.println("Is your number greater than or equal to "+mid+"? then type true else type false");
			boolean b=userBoolean();
			if(b==false){
				return findNumber(low,mid);
			}
			else{
				return findNumber(mid+1,high);
			}
		}while(low<=high);
	}
	
	public static void sort(String[] array) {
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
	}
	
	public static String swapNibble(String bin){
		char[] str_bin=bin.toCharArray();
		int low=0;
		char temp;
		int high=str_bin.length-1;
		int mid=(high+low)/2;
		int i=0,j=mid+1;
		while(i<=mid && j<=high){
			temp=str_bin[i];
			str_bin[i]=str_bin[j];
			str_bin[j]=str_bin[i];
			i++;
			j++;
		}
		return String.valueOf(str_bin);
		
		
		
	}
}
