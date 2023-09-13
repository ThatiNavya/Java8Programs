package com.constructorReference;

public class MyClassMain {

	public static void main(String[] args) {
		MyFunctionalInterface myFunctionalInterface=MyClass::new;
        MyClass obj = myFunctionalInterface.create("Navya",23 );
	}

}
