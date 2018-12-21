package com.bridgelabz.algorithmprogram;
import java.util.Scanner;

import com.bridgelabz.util.*;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range: say m and n");
		System.out.println("Enter m");
		int m=s.nextInt();
		System.out.println("Enter n");
		int n=s.nextInt();
		AlgorithmUtility.primeNumbers(m,n);
		s.close();
	}

}
