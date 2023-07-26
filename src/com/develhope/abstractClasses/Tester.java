package com.develhope.abstractClasses;

public class Tester {
	public static void main(String[] args) {
		Car a1 = new Car("Suv", 4, 4, 20000);
		Boat riva = new Boat("Cruiser",500,300);
		
		a1.showVehicleDetails();
		a1.doVehicleSound();
		
		riva.showVehicleDetails();
		riva.doVehicleSound();
		System.out.println(riva.getBoatWeightAndSpeed());
	}
}
