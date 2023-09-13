/*Declare names in an array and print names 
which are starting with 'A' using lambda expression.
String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };*/

package com.PredicateFunInterf;

import java.util.function.Predicate;

public class PrintingNames_Prediacte {

	public static void main(String[] args) {
		String[] names = { "Navya", "Karthika", "Vilasini", "Srilatha", "Anusha", "Jyothsna", "Nanditha", "Nandini" };
		Predicate<String> p = name -> name.charAt(0) == 'A';
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
