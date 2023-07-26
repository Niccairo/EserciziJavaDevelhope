package com.develhope.abstractClasses;

public class Boat extends Vehicle {
	private double maxKnotsSpeed;
	private int boatKilosWeight;
	
	public Boat(String type,double maxKnotsSpeed,int boatKilosWeight) {
		super(type);
		this.boatKilosWeight = boatKilosWeight;
		this.maxKnotsSpeed = maxKnotsSpeed;
	}
	@Override
	public void doVehicleSound() {
		System.out.println("Fiuuuu");
	}
	@Override
	public void showVehicleDetails(){
		System.out.println("The type of vehicle is " + super.getType());
	}
	
	public String getBoatWeightAndSpeed() {
		return "The total kilos weight : " + this.boatKilosWeight + "\nThe maximum knots speed" + this.maxKnotsSpeed;
	}
}
