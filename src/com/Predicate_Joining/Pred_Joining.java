package com.Predicate_Joining;

import java.util.function.Predicate;
import java.util.Scanner;

public class Pred_Joining {

	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen = i -> i > 10;
		Predicate<Integer> lessThanTwenty = i -> i < 20;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		boolean result1 = greaterThanTen.and(lessThanTwenty).test(n);
		System.out.println(result1);
		boolean result2 = lessThanTwenty.and(greaterThanTen).test(n);
		System.out.println(result2);
	}
}
