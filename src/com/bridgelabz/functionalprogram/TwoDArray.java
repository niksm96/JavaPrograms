package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		FunctionalUtilty fu=new FunctionalUtilty();
		System.out.println("Enter the number of rows: m");
		int m=s.nextInt();
		System.out.println("Enter the number of columns: n");
		int n=s.nextInt();
		System.out.println("1:Integer  2:Double  3:Boolean");
		int choice=s.nextInt();
		switch(choice){
			case 1: Integer[][] array=new Integer[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							array[i][j]=s.nextInt();
						}
					}
					fu.displayArray(array);
					break;
			case 2: Double[][] darray=new Double[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							darray[i][j]=s.nextDouble();
						}
					}
					fu.displayArray(darray);
					break;
			case 3: Boolean[][] barray=new Boolean[m][n];
					for(int i=0;i<m;i++){
						for(int j=0;j<n;j++){
							barray[i][j]=s.nextBoolean();
						}
					}
					fu.displayArray(barray);
					break;
			default: System.out.println("Select among the choices"); 
					 break;
		}
		s.close();
	}

}
