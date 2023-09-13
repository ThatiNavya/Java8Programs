package com.abstractClassDemo;

abstract class AbstractClass {
     public void AbstarctClass() {
    	 System.out.println("You can create constructor in abstarct class");
        
     }
     int substraction(int a, int b){       
         return a-b;    
     } 
     abstract int add(int a, int b);
     static int multiply(int a, int b) {
    	 return a*b;
     }
}
