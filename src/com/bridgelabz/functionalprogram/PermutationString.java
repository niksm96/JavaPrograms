package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class PermutationString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.nextLine();
		char array[]=str.toCharArray();
		int endIndex=str.length()-1;
		int startIndex=0;
		FunctionalUtilty fu=new FunctionalUtilty(6);
		String[] array1 = fu.permute(array, startIndex, endIndex);
		for (String string : array1) {
			System.out.println(string);
		}
	}
}
