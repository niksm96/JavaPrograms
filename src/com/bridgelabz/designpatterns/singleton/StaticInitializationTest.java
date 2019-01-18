package com.bridgelabz.designpatterns.singleton;

public class StaticInitializationTest {
	public static void main(String[] args) {
		StaticInitialization staticInitialization=StaticInitialization.getInstance();
		System.out.println(staticInitialization );
		StaticInitialization staticInitialization2=StaticInitialization.getInstance();
		System.out.println(staticInitialization2 );
		StaticInitialization staticInitialization3=StaticInitialization.getInstance();
		System.out.println(staticInitialization3 );
		
	}
}
