package com.interfaces;

public class Car implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("Car Started");
		
	}
	@Override
      public void cleanVehicle() {
		System.out.println("Car Cleaning Completed");
    }
	/*@Override
	public  void move() { //static method
		   System.out.println("Vehicle moved");
	   }*/
}
