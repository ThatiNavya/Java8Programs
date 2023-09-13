package com.lambdaExp_MultipleParameter;

public class LambdaExpDemo {

	private int operate(int a, int b,FuncInterf1 fobj) {
		return fobj.operation(a, b);
		
	}
	public static void main(String[] args) {
		FuncInterf1  add =(x,y)->x+y;
		
		FuncInterf1  multiply =(x,y)->x*y;
		LambdaExpDemo lobj = new LambdaExpDemo();
		System.out.println("Addition is "+lobj.operate(6,3, add));
		System.out.println("Multiplication is "+ lobj.operate(6, 3, multiply));
                 
		FuncInterf2 fobj =message->System.out.println("Hello"+message);
		            fobj.sayMessage(" Iam here");
	}

}
