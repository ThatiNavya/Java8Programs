package com.LambdaExpression_FunctionalInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@FunctionalInterface
public interface SquareValue {
     public int SquareIt(int n);
}
class SquareValueDemo{
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the Number");
		String str=br.readLine();
		int r=Integer.parseInt(str);
		SquareValue sq=n->n*n;
		System.out.println("The Square value of "+ r+" is"+" "+sq.SquareIt(r));
	}
}
