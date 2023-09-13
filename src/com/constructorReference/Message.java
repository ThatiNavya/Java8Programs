package com.constructorReference;

interface Messageable {
	Message getMessage(String msg);
}

public class Message {
	String msg;

	Message(String msg) {
		System.out.print(msg);
	}

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}

}
