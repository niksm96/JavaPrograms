package com.bridgelabz.util;
import com.bridgelabz.algorithmprogram.*;
import java.util.*;
public class AlgorithmUtility {
	
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
}
