package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.*;
public class ReplaceString {
	public static void main(String[] args) {
		String str="Hello <<UserName>>, How are you?";
		System.out.println("Enter the username");
		FunctionalUtilty fu=new FunctionalUtilty();
		fu.replaceString(str);
		
	}

}
