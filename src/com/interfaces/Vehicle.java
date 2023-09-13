package com.interfaces;

public interface Vehicle {
   public abstract void startVehicle(); //abstract method
   
    public default void cleanVehicle() {    //default method
    	System.out.println("Vehicle Cleaned");
    }
   public static void move() { //static method
	   System.out.println("Vehicle moved");
   }
}
