package com.bridgelabz.algorithmprogram;
import com.bridgelabz.util.*;
import java.util.*;
public class VendingMachine {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] notes={2000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the amount");
		int amt=s.nextInt();
		AlgorithmUtility.vendingMachine(notes,amt);
		s.close();
		
	}
}
