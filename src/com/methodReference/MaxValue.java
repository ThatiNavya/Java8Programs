// A functional interface that takes two integers and returns their maximum value
package com.methodReference;

interface Max {
	int getMax(int a, int b);
}

public class MaxValue {
	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		Max max = (a, b) -> MaxValue.max(a, b);
		System.out.println(max.getMax(10, 20));
	}
}
