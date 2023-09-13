package com.functionInterf;

import java.util.function.Function;

public class FunInterfDemo_length {

	public static void main(String[] args) {
		
		Function<String,Integer> f1=(name)->name.length();
        Integer result1 = f1.apply("NavyaThati");
        System.out.println(result1);
        
        Function<String,String> f2=(name)->name.toUpperCase();
        String result2 = f2.apply("NavyaThati");
        System.out.println(result2);
	}

}
