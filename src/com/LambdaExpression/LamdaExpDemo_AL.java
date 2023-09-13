package com.LambdaExpression;
import java.util.*;
public class LamdaExpDemo_AL {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(19);
		al.add(25);
		al.add(40);
		al.add(50);
        System.out.println(" All the elements present in the arraylist ");
		al.forEach(n->System.out.println(n));
		System.out.println("Even Numbers");
		al.forEach(n->{
			if(n%2==0)
				System.out.println(n);
		});
	}

}
