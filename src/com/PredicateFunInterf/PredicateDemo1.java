//Write a program to check given number is greater than 10 or not using LambdaExpressions
package com.PredicateFunInterf;

import java.util.function.Predicate;

public class PredicateDemo1{

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));

	}

}
