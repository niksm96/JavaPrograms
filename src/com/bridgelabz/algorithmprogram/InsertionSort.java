package com.bridgelabz.algorithmprogram;
import com.bridgelabz.util.*;
import java.util.*;
public class InsertionSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of strings to be inserted");
		int num=s.nextInt();
		String[] str_array=new String[num];
		for(int i=0;i<num;i++) {
			str_array[i]=s.next();
		}
		String[] res_str=AlgorithmUtility.insertionSort(str_array,num);
		for(int i=0;i<num;i++) {
			System.out.println(res_str[i]);
		}
		s.close();
	}
}
