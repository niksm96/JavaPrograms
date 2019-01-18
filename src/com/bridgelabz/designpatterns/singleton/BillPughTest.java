package com.bridgelabz.designpatterns.singleton;

public class BillPughTest {
	public static void main(String[] args) {
		BillPugh billPugh=BillPugh.getInstance();
		System.out.println(billPugh);
		BillPugh billPugh2=BillPugh.getInstance();
		System.out.println(billPugh2);
	}
}
