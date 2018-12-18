package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the value for n");
		FunctionalUtilty fu=new FunctionalUtilty();
		fu.powerOf2(n);
	}

}
