package com.bridgelabz.designpatterns.singleton;

public enum EnumSingleton {
 INSTANCE;
    
    public static void doSomething(EnumSingleton e){
        System.out.println("Demonstration of enum singleton");
        if(e==EnumSingleton.INSTANCE) {
        	System.out.println("Instance created");
        	System.out.println(INSTANCE.hashCode());
        }
    }
}