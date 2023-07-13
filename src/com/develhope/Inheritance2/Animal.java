package com.develhope.Inheritance2;

public class Animal {
	private String animalName;

	public Animal(String animalName) {
		this.animalName = animalName;
	}
	public void animalSound() {
		System.out.println("Rooar");
	}
	public void animalSound(String intensity) {
		if(intensity.equals("high")) {
			System.out.println("Rooooooooar");
		}else if(intensity.equals("low")) {
			System.out.println("Roar");
		}else {
			System.out.println("Cannot reproduce it properly");
		}
	}
	
}
