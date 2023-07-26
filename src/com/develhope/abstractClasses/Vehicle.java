package com.develhope.abstractClasses;

public abstract class Vehicle {
	private String type;
	private int numberOfWheels;
	
	public Vehicle(String type) {
		super();
		this.type = type;
	}

	public Vehicle(String type,int numberOfWheels) {
		super();
		this.type = type;
		this.numberOfWheels = numberOfWheels;
	}

	public void showVehicleDetails(){
		System.out.println("The type of vehicle is " + this.type + "\nThe number of wheels is "+ this.numberOfWheels);
	}
	
	 public abstract void doVehicleSound();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	 
	 
}
