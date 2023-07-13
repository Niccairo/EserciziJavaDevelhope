package com.develhope.Inheritance2;

public class TestAnimal {
	public static void main(String[] args) {
		Animal lion = new Animal("Lion");
		lion.animalSound();
		lion.animalSound("high");
		lion.animalSound("low");
		lion.animalSound("medium");
	}
}
