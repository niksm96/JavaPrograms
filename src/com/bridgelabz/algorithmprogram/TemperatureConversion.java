package com.bridgelabz.algorithmprogram;
import java.util.*;
import com.bridgelabz.util.*;
public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the choice to convert to the following:");
		System.out.println("1-Fahrenheit 2-Celcius");
		int choice=s.nextInt();
		System.out.println("Enter the temp");
		double temp=s.nextDouble();
		AlgorithmUtility.temperatureConversion(choice,temp);
		s.close();
		
	}
}
