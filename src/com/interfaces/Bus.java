package com.interfaces;

public class Bus implements Vehicle {

	@Override
	public void startVehicle() {
		System.out.println("Bus Started");
		
	}
	@Override
	public void cleanVehicle() {
		System.out.println("Bus Cleaning Completed");
  }

}
