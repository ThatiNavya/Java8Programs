package com.LambdaExpression_FunctionalInterface;
import java.io.*;
@FunctionalInterface
public interface MyInterface {
          double getPiValue();
}
class Area{
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the Number");
		String str=br.readLine();
		int r=Integer.parseInt(str);
		
		MyInterface ref =()->3.1415;
		System.out.println("Area of circle with given radius is="+r*r*ref.getPiValue());
	}
     

}
