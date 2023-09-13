package com.default_static_mutlipleInheritence;

public class TestClass implements TestInterface1, TestInerface2{

	@Override
	public void show() {
		
		TestInterface1.super.show();
		TestInerface2.super.show();
	}

}
