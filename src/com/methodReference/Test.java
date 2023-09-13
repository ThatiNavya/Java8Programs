package com.methodReference;

interface MyInterface {
	public void m1();
}

public class Test {

	public static void m2() {
		System.out.println("method reference");
	}

	public void m3() {
		System.out.println("method reference");
	}

	public static void main(String[] args) {
		System.out.println("**Static method**");
		MyInterface i = Test::m2;
		i.m1();

		System.out.println("**Instance method**");
		Test t = new Test();
		MyInterface m = t::m3;
		i.m1();

	}

}
