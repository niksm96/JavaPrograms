/******************************************************************************
 *  Compilation:  javac -d bin FunctionalUtility.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.functionalprogram package
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;
import java.util.Random;

public class FunctionalUtilty<E> {

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
	 * permuteArray stores the array of possible permutation of a
	 * string hence resulting in array of strings
	 */
	private String[] permuteArray;
	
	/**
	 * index stores the varying index value of the array
	 */
	private int index = 0;
	
	/**
	 * Default constructor 
	 */
	public FunctionalUtilty() {}
	
	/**
	 * Constructor to take the input for fact
	 * 
	 * @param fact the number that represents factorial 
	 */
	public FunctionalUtilty(int fact) {
		this.permuteArray = new String[fact];
	}
	
	/**
	 * static function that is used to replace a string in a given template
	 * 
	 * @param str the string template whose substring is to be replaced
	 * 			  with the another string
	 * @param uname the string with which the string in the template
	 * 		  is replaced
	 * @return string the string template that is modified.
	 */
	public static String replaceString(String str,String uname) {
		if (uname.length() >= 3) {
			String rString = str.replace("<<UserName>>", uname);
			return rString;
		} else {
			return "User name should be min of 3 characters";
		}
	}

	/**
	 * static function to find the head vs tail percentage after 
	 * flipping the coin n times
	 * 
	 * @param n the number of times to flip a coin
	 */
	public static void perHeadTail(int n) {
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
		double per_tail = (tail*100/ num);
		double per_head = (head*100/ num);
		System.out.println("Head Vs Tail: " + per_head + ":" + per_tail);
	}

	/**
	 *  static function to check if the given year is a leap year or not
	 * 
	 * @param year the year to be checked whether it is a leap year or not
	 * @return true if leap year else false
	 */
	public static boolean leapYear(int year) {
		if (String.valueOf(year).length() == 4) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				return true;
			else
				return false;
		} else
			System.out.println("Year should be of 4 digits");
			return false;
	}
	
	/**
	 * static function to print all the values of the 2 power of N
	 * 
	 * @param n the number that is taken to the power of 2
	 */
	public static void powerOf2(int n){
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
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static double harmonicValue(int n){
		double sum=0;
		for(double i=1;i<=n;i++)
			sum=sum+(1/i);
		return sum;
	}
	
	/**
	 * 
	 * @param n the number whose prime factors are to be found
	 */
	public static void primeFactor(int n){
		while(n%2==0){
			System.out.println(2);
			n=n/2;
		}
		for(int i=3;i<Math.sqrt(n);i+=2){
			while(n%i==0){
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
	}
	
	/**
	 * static function to gamble 
	 * 
	 * @param stake the amount that is at stake
	 * @param goal the amount to be obtained
	 * @param no_of_times the number of times gambled
	 */
	public static void gambler(int stake,int goal,int no_of_times){
		int win=0,loose=0;
		for(int i=1;i<=no_of_times;i++){
			double r=Math.random();
			int cash=stake;
			while(cash>0 && cash<goal){
				if(r<0.5)
					cash--;
				else
					cash++;
			}
			if(cash==goal)
				win++;
			else
				loose++;
		}
		System.out.println(win + " wins of " + no_of_times);
        System.out.println("Percent of games won = " + 100.0 * win / no_of_times);
        System.out.println("Percent of games lose= " + 100.0 * loose/no_of_times);
		s.close();
	}
	
	/**
	 * static function to generate distinct coupon numbers
	 * 
	 * @param num the number of coupon numbers to be generated
	 * @return the count of random numbers of generated to obtain 
	 * 			distinct coupon numbers
	 */
	public static int couponNumber(int num){
		Random r=new Random();
		int dist=0,count=0;
		boolean coupon[]=new boolean[num];
		while(dist<num){
			int rand_num=r.nextInt(num);
			count++;
			if(!coupon[rand_num]){
				dist++;
				System.out.println(dist);
				coupon[rand_num]=true;
			}
		}
		return count;
	}
	
	/**
	 * static function that prints the array of generic type
	 * 
	 * @param garray array of any data type 
	 */
	public void displayArray(E[][] garray){
		for(int i=0;i<garray.length;i++){
			for(int j=0;j<garray.length;j++){
				System.out.println(garray[i][j]);
			}
		}
		
	}
	
	/**
	 * static function to obtain triplet integers that gives 0 upon addition
	 * 
	 * @param num the number of integers in an array
	 */
	public static void sumZero(int num){
		int array[]=new int[50];
 		System.out.println("Enter the interges in the array");
		for(int i=0;i<num;i++){
			array[i]=s.nextInt();
		}
		System.out.println("The triplets that sum to zero are:");
		boolean flag=false;
		for(int i=0;i<num-2;i++){
			for(int j=i+1;j<num-1;j++){
				for(int k=j+1;k<num;k++){
					if(array[i]+array[j]+array[k]==0){
						System.out.println("("+array[i]+","+array[j]+","+array[k]+")");
						flag=true;
					}
				}
			}
		}
		if(flag==false)
			System.out.println("No such triplets found");
		s.close();
	}
	
	/**
	 * static function that calculates the distance between the
	 * two points (x,y)
	 * 
	 * @param x the integer that represents a point
	 * @param y the integer that represents a point 
	 * @return distance the distance between the two points
	 */
	public static double distance(int x,int y){
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	/**
	 * static function that is used to find the roots of a 
	 * given quadratic equation 
	 * 
	 * @param a the number of x*x
	 * @param b the number of x
	 * @param c the constant of the equation
	 */
	public static void quadratic(int a,int b,int c){
			double delta=(b*b)-(4*a*c);
			if(delta>0){
				double first_root=(-b+Math.sqrt(delta))/(2*a);
				double second_root=(-b-Math.sqrt(delta))/(2*a);
				System.out.println("The roots are real and unequal:");
				System.out.println("First root:"+ first_root);
				System.out.println("Second root:"+ second_root);
			}
			else if(delta==0){
				double first_root=(-b+Math.sqrt(delta))/(2*a);
				System.out.println("The roots are real and equal:");
				System.out.println("First root:"+ first_root);
			}
			else
				System.out.println("The roots are imaginary");
	}
	
	/**
	 * static function that calculates the efficient temperature 
	 * 
	 * @param temp the temperature
	 * @param wind_speed the speed of the wind
	 * @return efficient temperature calculated
	 */
	public static double windChill(double temp,double wind_speed){
		if(temp<Math.abs(50)||(wind_speed<120 && wind_speed<3)){
			double eff_temp=35.74+(0.6215*temp)+(0.4275*temp-35.75)*Math.pow(wind_speed, 0.16);
			return eff_temp;
		}
		else
			return -1;
			
	}
	
	/**
	 * static function to program a stop watch 
	 * 
	 * @param start_end the boolean value to stop or start the watch
	 * @param end the integer value to end the watch when started
	 */
	public static void stopWatch(boolean start_end,int end) {
		if(start_end==true) {
			long start_time=System.currentTimeMillis();
			if(end==0) {
				long end_time=System.currentTimeMillis();
				long res=end_time-start_time;
				System.out.println(res);
			}
			else
				System.out.println("Enter 0 to end");
		}
	}
	
	/**
	 * static function to find the permutation of a string recursively
	 * 
	 * @param array the array of characters 
	 * @param startIndex the start index of the array
	 * @param endIndex the end index of the array
	 * @return array the array of strings that contains all the possible 
	 * 				 permutation of the string.
	 */
	public String[] permute(char[] array, int startIndex, int endIndex) {
        if(startIndex == endIndex){
        	permuteArray[index++] = String.valueOf(array);
           // System.out.println(String.valueOf(array)); 
        }else{
            for(int i=startIndex;i<=endIndex;i++) {
                 swap(array, startIndex, i );
                 permute(array, startIndex+1, endIndex);
                 swap(array, startIndex, i );
            }
        }
		return permuteArray;
    }
	
	/**
	 * static function that is used to swap the elements in a array
	 * 
	 * @param array
	 * @param x
	 * @param y
	 */
	public static void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
	
}
