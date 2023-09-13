package com.defaultMethods;

public interface TestInterface {
     public void square(int a);  //Abstract method
     
     default void show() {
    	 System.out.println("Default method Executed");
     }
     static void shows() {
    	 System.out.println("Static Method Executed");
     }
}
