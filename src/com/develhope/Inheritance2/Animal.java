package com.develhope.Inheritance2;

public class Animal {
	private String animalName;

	public Animal(String animalName) {
		this.animalName = animalName;
	}
	public void animalSound() {
		animalSound(null);
	}
	public void animalSound(String intensity) {
		if("high".equals(intensity)) {
			System.out.println("Rooooooooar");
		}else if("low".equals(intensity)) {
			System.out.println("Roar");
		}else {
			System.out.println("Rooar");
		}
	}
}
