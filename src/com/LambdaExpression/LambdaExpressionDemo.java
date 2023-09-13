package com.LambdaExpression;
import java.util.*;
public class LambdaExpressionDemo {
    public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("24th batch Team members");
		list.add("Navya");
		list.add("Jyothsna");
		list.add("Manoj");
		list.add("TejaHarsha");
		list.add("Vishnu");
		list.forEach(n->System.out.println(n));
	}
}
