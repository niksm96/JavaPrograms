package com.bridgelabz.util;
import java.util.Scanner;
import java.util.Random;

public class FunctionalUtilty<E> {
	
	private String[] permuteArray;
	private int index = 0;
	
	public FunctionalUtilty() {}
	
	public FunctionalUtilty(int fact) {
		this.permuteArray = new String[fact];
	}
	
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
		s.close();
	}
	
	public void gambler(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the stake");
		int stake=s.nextInt();
		System.out.println("Enter the goal");
		int goal=s.nextInt();
		System.out.println("Enter the number of times to gamble");
		int no_of_times=s.nextInt();
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
	
	public void couponNumber(){
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		int num=s.nextInt();
		int dist_num[]=new int[num];
		int temp=0,count=0;
		for(int i=0;i<num;i++){
			int rand_num=r.nextInt(num);
			count++;
			if(temp!=rand_num)
				dist_num[i]=rand_num;
			temp=dist_num[i];
		}
		for(int i=0;i<num;i++){
			System.out.print(dist_num[i]+" ");
		}
		System.out.println();
		System.out.println("Number of random numbers needed:"+ count);
		s.close();
	}
	
	public void displayArray(E[][] garray){
		for(int i=0;i<garray.length;i++){
			for(int j=0;j<garray.length;j++){
				System.out.println(garray[i][j]);
			}
		}
		
	}
	
	public void sumZero(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int num=s.nextInt();
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
	
	public double distance(int x,int y){
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	
	public void quadratic(int a,int b,int c){
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
	
	public void windChill(double temp,double wind_speed){
		if(temp<Math.abs(50)||(wind_speed<120 && wind_speed<3)){
			double eff_temp=35.74+(0.6215*temp)+(0.4275*temp-35.75)*Math.pow(wind_speed, 0.16);
			System.out.println("The efficient temperature:"+ eff_temp);
		}
		else
			System.out.println("Temperature or Wind Speed out of range");
			
	}
	
	public void stopWatch() {
		Scanner s=new Scanner(System.in);
		boolean start_end=s.nextBoolean();
		if(start_end==true) {
			long start_time=System.currentTimeMillis();
			System.out.println("Enter 0 to end");
			int end=s.nextInt();
			if(end==0) {
				long end_time=System.currentTimeMillis();
				long res=end_time-start_time;
				System.out.println(res);
			}
			else
				System.out.println("Enter 0 to end");
		}
		s.close();
	}
	
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
	public void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
	
	public void ticTacToe(char[][] board,int computer,char player) {
		Random r=new Random();
		int choice=r.nextInt(1);
		if(choice==0) {
			
		}
	}
}
