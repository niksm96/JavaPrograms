package com.bridgelabz.algorithmprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class AnagramDetection {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=s.nextLine();
		System.out.println("Enter another string to detect anagram");
		String str2=s.nextLine();
		boolean rs=AlgorithmUtility.isAnagram(str1,str2);
		if(rs) {
			System.out.println("The strings are anagram");
		}
		else
			System.out.println("The strings are not anagram");
		s.close();
	}
}
