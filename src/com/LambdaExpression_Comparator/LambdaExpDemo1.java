package com.LambdaExpression_Comparator;
import java.util.*;
public class LambdaExpDemo1 {
  public static void main(String[] args) {
	List<Product> list= new ArrayList<Product>();
    
	list.add(new Product(1,"HP Laptop",65000d));
	list.add(new Product(3,"Keyboard",3000d));
	list.add(new Product(2,"Dell Mouse",1500d));
	System.out.println("Sorting onthe basis of Product name");
	Collections.sort(list,(p1,p2)->{  //D H K
        return p1.name.compareTo(p2.name);  
        });  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  }
}
