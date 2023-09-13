package com.methodReference;

public class Test1 {
     public void m1() {
        for(int i =0;i<10;i++) {
        	System.out.println("Child Thread-"+Thread.currentThread().getName());
        }
     }
	public static void main(String[] args) {
		Test1 test = new Test1();
		Runnable r= test::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i =0;i<10;i++) {
        	System.out.println("Main Thread-"+Thread.currentThread().getName());
        }
	}

}
