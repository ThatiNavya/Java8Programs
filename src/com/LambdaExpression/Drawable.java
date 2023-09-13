package com.LambdaExpression;

public interface Drawable {
     public void draw();
}
class LambdaExpression{
	public static void main(String[] args) {
		int width=16;
		Drawable d2=()->System.out.println("Drawing-"+width);
	    d2.draw();
	}
}
