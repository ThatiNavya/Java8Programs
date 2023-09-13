package com.LambdaExpression;

public class Test {

	public static void main(String[] args) {
		FunInterface fi = a -> System.out.println(2 * a);
        fi.abstractFun(5);
	}

}
