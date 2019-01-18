package com.bridgelabz.designpatterns.singleton;

public class LazyInitializationTest {
	public static void main(String[] args) {
		LazyInitialization lazyInitialization = LazyInitialization.getInstance();
		System.out.println(lazyInitialization);

		LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();

		System.out.println(lazyInitialization2);

	}
}
