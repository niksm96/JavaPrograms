package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Equation of the form: a*x*x+b*x+c");
		System.out.println("Enter the value for a");
		int a=s.nextInt();
		System.out.println("Enter the value for b");
		int b=s.nextInt();
		System.out.println("Enter the value for c");
		int c=s.nextInt();
		FunctionalUtilty fu=new FunctionalUtilty();
		fu.quadratic(a,b,c);
		s.close();
	}

}
