package com.LambdaExpression;

public class Demo {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Child Thread Started-" + Thread.currentThread().getName());

		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Main Thread Started -"+Thread.currentThread().getName());
	}
}
