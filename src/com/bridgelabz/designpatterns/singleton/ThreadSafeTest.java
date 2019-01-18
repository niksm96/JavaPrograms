package com.bridgelabz.designpatterns.singleton;

public class ThreadSafeTest {
	public static void main(String[] args) {
		ThreadSafe threadSafe=ThreadSafe.getInstance();
		Thread thread=new Thread(threadSafe);
		thread.start();
		System.out.println(thread.getName());
		System.out.println(threadSafe);
		ThreadSafe threadSafe2=ThreadSafe.getInstance();
		Thread thread2=new Thread(threadSafe2);
		thread2.start();
		System.out.println(thread2.getName());
		System.out.println(threadSafe2);
	}
}
