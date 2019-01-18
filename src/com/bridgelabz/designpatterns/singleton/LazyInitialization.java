package com.bridgelabz.designpatterns.singleton;

public class LazyInitialization implements Runnable{
	private static LazyInitialization instance;

	private LazyInitialization(){}

	public static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();	
		}
		return instance;
	}

	@Override
	public void run() {
		System.out.println("trying to create two different instances");
		
	}


}
