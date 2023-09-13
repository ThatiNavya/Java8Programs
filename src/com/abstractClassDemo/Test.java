package com.abstractClassDemo;

public class Test {
	public static void main(String[] args) {
		AbstractTest a = new AbstractTest();
		int result1=a.add(10, 20);
		int result2 = a.substraction(20, 10);  
		int result3 = AbstractClass.multiply(10, 5); 
		System.out.println("Addition: "+result1);    
        System.out.println("Substraction: "+result2);    
        System.out.println("Multiplication: "+result3);
	}
	
}
