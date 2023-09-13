package com.PredicatePrograms;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {

	static void pred(int num,Predicate<Integer> predicate) {
		if(predicate.test(num)) {
			System.out.println("Number-"+num+" Condition Satisfied");
		}
		else {
			System.out.println(num+"-condition failed");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter The Number to check which is greater than 7or not");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		pred(n,(i)->i>7);
	}

}
