package com.biPredicate_FunInter;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, String> bipredicate1 = (n, s) -> {
			if (n == Integer.parseInt(s)) {
				return true;
			}
			return false;

		};
		System.out.println(bipredicate1.test(2, "2"));
		System.out.println("*********************");

		BiPredicate<Integer, String> bipredicate2 = (n, s) -> {
			if (n>Integer.parseInt(s)) {
				return true;
			}
			return false;

		};
		BiPredicate<Integer, String> bipredicate3 = bipredicate1.and(bipredicate2);
		System.out.println(bipredicate3.test(2, "3"));
		System.out.println("*********************");
		BiPredicate<Integer, String> bipredicate4 = bipredicate1.or(bipredicate2);
		System.out.println(bipredicate4.test(3,"2"));
		System.out.println("*********************");
	}

}
