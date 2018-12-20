package com.bridgelabz.functionalprogram;
import com.bridgelabz.util.*;
import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit");
		double temp=s.nextDouble();
		System.out.println("Enter the speed of the wind");
		double wind_speed=s.nextDouble();
		FunctionalUtilty fu=new FunctionalUtilty();
		fu.windChill(temp, wind_speed);
		s.close();
	}
}
