package com.LambdaExpression;

public interface Addition {

	int add(int a, int b);

}
class LambdaExpression2{
	public static void main(String[] args) {
		Addition ad1 =(a,b)->(a+b);
		System.out.println("The sum:"+ad1.add(10,20));
		
		Addition ad2 =(a,b)->(a+b);
		System.out.println("The sum:"+ad2.add(15,20));
	}
}
