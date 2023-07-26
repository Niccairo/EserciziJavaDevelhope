package com.develhope.abstractClasses;

public class Car extends Vehicle {
	private int numberOfDoors;
	private double carPrice;
	
	
	public Car(String type, int numberOfWheels,int numberOfDoors, double carPrice) {
		super(type,numberOfWheels);
		this.numberOfDoors = numberOfDoors;
		this.carPrice = carPrice;
	}
	@Override
	public void doVehicleSound() {
		System.out.println("Brooom");
	}
	@Override
	public void showVehicleDetails(){
		 super.showVehicleDetails();
		 System.out.println("\nThe number of doors is " + this.numberOfDoors); 
	}
}
