package com.methodReference;

interface StringLength1 {
	int getLength(String str);
}

public class LengthExample1 {

	private String name;

	public LengthExample1(String name) {

		this.name = name;
	}

	public int length(String s) {

		return name.length();
	}

	public static void main(String[] args) {

		LengthExample1 ex = new LengthExample1("Java");

		StringLength stringLength = ex::length;

		System.out.println(stringLength.getLength(ex.name));
	}
}
