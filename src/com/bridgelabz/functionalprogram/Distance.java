package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x");
		int x=s.nextInt();
		System.out.println("Enter y");
		int y=s.nextInt();
		FunctionalUtilty fu=new FunctionalUtilty();
		double dist=fu.distance(x,y);
		System.out.println(dist);
		s.close();
	}

}
