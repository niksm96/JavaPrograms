package com.bridgelabz.designpatterns.singleton;

public class EagerInitializationMain {
	public static void main(String[] args) {
		EagerInitialization eagerInitialization=EagerInitialization.getInstance();
		System.out.println(eagerInitialization);
//		String str=eagerInitialization.toString();
//		System.out.println(str);
		System.out.println(eagerInitialization.hashCode());
		EagerInitialization eagerInitialization2=EagerInitialization.getInstance();
		System.out.println(eagerInitialization2);
		System.out.println(eagerInitialization2.hashCode());
		EagerInitialization eagerInitialization3=EagerInitialization.getInstance();
		System.out.println(eagerInitialization3);
		System.out.println(eagerInitialization3.hashCode());
//		EagerInitialization eagerInitialization4=new EagerInitialization();
		System.out.println(eagerInitialization);
	}
}