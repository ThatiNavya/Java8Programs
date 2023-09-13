package com.LambdaExpression;

public interface WishDemo {
   
	public String say(String name);
}
class LambdaExpression1{
	public static void main(String[] args) {
		WishDemo wish1=name->{
			return "Good Morning"+" "+name;
		};
		System.out.println(wish1.say("Navya"));
		
		WishDemo wish2=name->{
			return "Good Morning"+" "+name;
		};
		System.out.println(wish2.say("Jyothsna"));
	}
}
