//A functional interface that takes two integers and returns their sum

package com.methodReference;

interface Sum {
	public int add(int a, int b);
}

public class SumExmaple {

	public static int add(int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {
		Sum sum = SumExmaple::add;
		System.out.println(sum.add(10, 20));

	}

}
