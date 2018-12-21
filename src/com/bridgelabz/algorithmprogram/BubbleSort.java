package com.bridgelabz.algorithmprogram;
import com.bridgelabz.util.*;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of intergers to be sorted");
		int n=s.nextInt();
		int[] array=new int[50];
		System.out.println("Enter the integers");
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		AlgorithmUtility.bubbleSort(array,n);
		s.close();
	}

}
