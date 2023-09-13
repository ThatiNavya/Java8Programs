package com.biFunction_FunInter;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println("Sum=" + add.apply(10, 20));
		
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a*b;
		System.out.println("Product=" + multiply.apply(10, 20));
		
		BiFunction<String,String,Integer> length =(firstname,lastname)->{
			String result=firstname.concat(lastname);
			return result.length();
			
		};
		System.out.println(length.apply("Navya", "Thati"));
		
	}

}
