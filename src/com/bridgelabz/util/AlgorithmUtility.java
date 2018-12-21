package com.bridgelabz.util;
import com.bridgelabz.algorithmprogram.*;
import java.util.*;
public class AlgorithmUtility {
	
	public static boolean isAnagram(String str1,String str2) {
		char[] n_str1=str1.toLowerCase().toCharArray();
		char[] n_str2=str2.toLowerCase().toCharArray();
		int len1=n_str1.length;
		int len2=n_str2.length;
		if(len1!=len2) {
			return false;
		}
		else{
			Arrays.sort(n_str1);
			Arrays.sort(n_str2);
			for(int i=0;i<len1;i++){
				if(n_str1[i]==n_str2[i])
					return true;
				
			}
			return false;
		}	
	}
	
	public void primeNumbers(int m,int n) {
		int temp;
		if(m>n) {
			temp=m;
			m=n;
			n=temp;
		}
		for(int i=m;i<n;i++){
			for(int j=m;j<i;j++){
				if(i%j!=0)
					System.out.print(i+" ");
			}
		}
	}
}
