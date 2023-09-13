package com.methodReference;

import java.util.function.Consumer;

public class ConsumerExamp {

	public static void main(String[] args) {

		String message = "Hello, world!";
		Consumer<String> consumer = str -> System.out.println("Length of message: " + str.length());
		consumer.accept(message);

	}

}
