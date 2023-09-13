//A functional interface that takes a string and returns its length
package com.methodReference;

interface StringLength {
	int getLength(String str);
}

public class LengthExample {
	public static int length(String str) {
		return str.length();

	}

	public static void main(String[] args) {
		StringLength len = s -> LengthExample.length(s);
		System.out.println(len.getLength("Method reference"));
	}

}
