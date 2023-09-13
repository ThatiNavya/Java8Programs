package com.PredicatePrograms;

import java.util.function.Predicate;
import java.util.Scanner;

public class PredicateDemo1 {
   public static void main(String[] args) {
	
	   Predicate<Integer> eligible=i->i>=18;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Age");
	   int age=sc.nextInt();
	   if(eligible.test(age)) {
		   System.out.println("Eligble for Vote");
	   }
	   else {
		   System.out.println("not Eligible for Vote");
	   }
}
}
