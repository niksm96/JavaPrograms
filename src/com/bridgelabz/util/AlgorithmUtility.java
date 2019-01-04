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

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AlgorithmUtility<T>{
	
	/**
	 * static object is created for Scanner class to avoid
	 * multiple object creations of the same class.
	 */
	static Scanner s=new Scanner(System.in);

	/**
	 * static function to read integers input from the user
	 * @return integer values that are read
	 */
	public static int userInt(){
			return s.nextInt();
	}
	
	/**
	 * static function to read double input from the user
	 * @return double values that are read
	 */
	public static double userDouble(){
			return s.nextDouble();
	}
	
	/**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static boolean userBoolean(){
			return s.nextBoolean();
	}
	
	/**
	 * static function to read string input from the user
	 * @return strings that are read
	 */
	public static String userString(){
			return s.next();
	}
	
	/**
	 *Static function to check if the two strings are anagram or not.
	 * @param <T>
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean isAnagram(String str1,String str2) {
		char[] array1=str1.toCharArray();
		char temp1,temp2;
		char[] array2=str2.toCharArray();
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			return false;
		}
		else{
			for(int i=0;i<len1;i++){
				for(int j=0;j<len1-1;j++){
					if(array1[j]>array1[j+1]){
						temp1=array1[j];
						array1[j]=array1[j+1];
						array1[j+1]=temp1;
					}
				}
			}
			for(int i=0;i<len2;i++){
				for(int j=0;j<len2-1;j++){
					if(array2[j]>array2[j+1]){
						temp2=array2[j];
						array2[j]=array2[j+1];
						array2[j+1]=temp2;
					}
				}
			}
			str1=String.valueOf(array1);
			str2=String.valueOf(array2);
			if(str1.equals(str2))
				return true;
			else
				return false;
		}	
	}
	
	/**
	 *static function to print the prime numbers for the given range
	 * 
	 * @param m the integer that represents the lower bound of the range
	 * @param n the integer that represents the upper bound of the range
	 * @return list of integers that are prime numbers between the range
	 */
	public static List<Integer> primeNumbers(int start,int end) {
		List<Integer> lst=new ArrayList<Integer>();
		int flag=1;
		for(int i=start+2;i<end;i++){
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
				lst.add(i);
			}
		}
		return lst;
	}
	
	/**
	 * static function to sort the array using bubble sort algorithm
	 * 
	 * @param array the array of integers that is to be sorted
	 * @param n the number of integers in the array
	 * @return integer array the array that is sorted
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array,int n) {
		T temp;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	/**
	 * static function to sort the given array of strings using insertion sort
	 * 
	 * @param array the array of strings that is to be sorted 
	 * @param num the number of strings to be sorted
	 * @return array the array of strings that are sorted
	 */
	public static String[] insertionSort(String[] array,int num) {
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
		return array; 
	}
	
	/**
	 * 
	 * @param notes the array of possible notes in integers
	 * @param amt the amount that you need change for
	 * @return integer the minimum changes needed for the amount entered
	 */
	public static int vendingMachine(int[] notes,int amt) {
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
		return temp;
	}
	
	/**
	 * static function that converts given temperature from celcius to fahrenheit 
	 * and vice versa
	 * 
	 * @param choice the choice to which temperature the user wants to convert to
	 * @param temp the temperature to be converted
	 * @return temperature that is converted
	 */
	public static double temperatureConversion(int choice,double temp) {
		double f_temp,c_temp;
		switch(choice){
			case 1: System.out.println("Your input is in celcius so your fahrenheit temp is:");
			 		f_temp=(temp*(9/5))+32;
			 		return f_temp;
			 		
			case 2: System.out.println("Your input is in fahrenheit then your celcius temp is:");
	 				c_temp=(temp-32)*(5/9);
	 				return c_temp;
	 				
	 		default: return 0;
		}
	}
	
	/**
	 * static function that calculates the monthly payment
	 * 
	 * @param principle the principle amount taken loan 
	 * @param year the years to pay off
	 * @param rate the interest rate 
	 * @return monthly payment 
	 */
	public static double monthlyPayment(int principle,int year,double rate) {
		int num=12*year;
		double rt=(rate)/(12*100);
		return (principle*rt)/(1-Math.pow(1+rt, -num));
		
	}
	
	/**
	 * static function that calculates the square root of a given number
	 * 
	 * @param num the number whose square root is to be found
	 */
	public static double squareRoot(double num) {
		double temp=num;
		double epsilon=1e-15;
		if(num>0) {
			while(Math.abs(temp-num/temp)> epsilon*temp) {
			temp=(num/temp+temp)/2;
			}
		}
		return temp;
	}
	
	/**
	 * static function that converts decimal to binary 
	 * 
	 * @param num the number that is to be converted to binary
	 * @return array the array of integers that contains binary bits of the number
	 */
	public static int[] toBinary(int num){
		int[] bin=new int[8];
		int i=0;
		do{
			bin[i]=num%2;
			num=num/2;
			i++;
		}while(num!=0);
		return bin;
	}
	
	/**
	 * static function that finds the day of the week provided date 
	 * 
	 * @param month the numeric representation the of month
	 * @param date the numeric representation the of date
	 * @param year the numeric representation the of year
	 * @return integer the numeric representation of the day 
	 */
	public static int dayOfWeek(int month,int date,int year) {
		int year1=year-(14-month)/12;
		int x=year1+(year1/4)-(year1/100)+(year1/400);
		int month1=month+12*((14-month)/12)-2;
		int date1=(date+x+(31*month1)/12)%7;
		return date1;
	}
	
	/**
	 * static function that sorts the given array using bubble sort algorithm
	 * 
	 * @param array the array of integers or strings to be sorted
	 */
	public static void bubbleSortGeneric(String[] array) {
		String temp;
		for(int i=1;i<=array.length;i++) {
			for(int j=1;j<=array.length-i;j++) {
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
	
	/**
	 * static function that sorts the given array using insertion sort
	 * 
	 * @param array the array of integers or strings that is to be sorted
	 * @param num the number of integers to be sorted
	 */
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
	 * static function that search for the given key in a array using 
	 * binary search algorithm
	 * 
	 * @param array the array of integers or strings from which key is to
	 * 				be found
	 * @param key the key to be searched in the array
	 * @return index the index of the key, found in the array
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
	
	/**
	 * static function to merge the sorted arrays obtained from the 
	 * merge function.
	 * 
	 * @param array the array of strings that are needed to be sorted
	 * @param low the lower bound of the array 
	 * @param high the higher bound of the array
	 */
	public static void mergeSort(String[] array,int low,int high){
		int mid;
		if(low<high){
			mid=(high+low)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
		    merge(array,low,mid,high);
		}
	}
	
	/**
	 * static function that sorts the array of strings by dividing the
	 * array into sub arrays 
	 * 
	 * @param array the array of strings that are needed to be sorted
	 * @param low the lower bound of the array 
	 * @param mid the mid index of the array
	 * @param high the higher bound of the array
	 */
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
	
	/**
	 * static function that is used to print the array
	 * 
	 * @param array the array to be printed
	 */
	public static void print(String [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
	/**
	 * static function that finds the number N that is guessed between the 
	 * range of numbers such that the range is 2 to the power of N 
	 * 
	 * @param low the lower bound among the range of the numbers 
	 * @param high the upper bound among the range of the numbers
	 * @return number the number that is guessed among the range of numbers
	 */
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
	
	/**
	 * static function that is used to sort the array
	 * 
	 * @param array the array that is needed to be sorted
	 */
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
	
	/**
	 * static function that used to swap nibble of a byte
	 * 
	 * @param number number to be swapped
	 * @return integer integer that is swapped
	 */
	public static int swapNibble(int num){
		return ((num & 0x0F) << 4 | (num & 0xF0) >> 4); 
		}
	
	/**
	 * static function that is used to add prime numbers that are
	 * anagram 
	 * 
	 * @param new_lst the list of prime numbers 
	 * @return set of prime numbers that are anagram
	 */
	public static Set<String> anagramPrime(List<String> new_lst){
		Set<String> set=new HashSet<>();
		for(int i=0;i<new_lst.size();i++){
			for(int j=i+1;j<new_lst.size();j++){
				if(isAnagram(new_lst.get(i), new_lst.get(j))){
					set.add(new_lst.get(i));
					set.add(new_lst.get(j));
					System.out.println(new_lst.get(i)+"  "+new_lst.get(j));
				}
			}
		}
		return set;
	}
	
	/**
	 * static function that is used to add prime numbers that are 
	 * anagram and palindrom
	 * 
	 * @param set the set of prime numbers that are anagram
	 * @return set the set of prime numbers that are anagram and palindrom
	 */
	public static Set<String> palindromPrime(List<String> new_lst){
		Set<String> pal_set=new HashSet<>();
		Iterator<String> itr=new_lst.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(isPalindrom(str)){
				pal_set.add(str);
			}
		}
		return pal_set;
	}
	
	/**
	 * static function that is used to check if the passed string 
	 * is a palindrom or not 
	 * 
	 * @param str the string that is to be checked if it is a palindrom 
	 * 				or not
	 * @return true if the string is palindrom else false
	 */
	public static boolean isPalindrom(String str){
		char temp;
		int begin=0;
		int end=str.length()-1;
		String rev_str=str;
		char[] array=str.toCharArray();
		while(begin<=end){
			temp=array[begin];
			array[begin]=array[end];
			array[end]=temp;
			begin++;
			end--;
		}
		String new_str=String.valueOf(array);
		if(rev_str.equals(new_str))
			return true;
		else
			return false;
	}
	
	/**
	 * 
	 * @param elapsed_time the map that contains [key, pair] values that
	 * 		  represents algorithm and its elapsed time respectively.
	 * @return map that contains the sorted map of [key,pair] values that are sorted
	 * 			by values
	 */
	public static Map<String,Double> sortByValue(Map<String, Double> elapsed_time){
		//Creating a list from the hashmap
		 List<Map.Entry<String, Double> > list = 
	               new LinkedList<Map.Entry<String, Double> >(elapsed_time.entrySet()); 
		 
		 //Sort the list 
		 Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {

			@Override
			public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		 
		// put data from sorted list to hashmap  
		Map<String, Double> temp = new LinkedHashMap<String, Double>(); 
	        for (Map.Entry<String, Double> hmap : list) { 
	            temp.put(hmap.getKey(), hmap.getValue()); 
	        } 
	        return temp;
	}
	
}
