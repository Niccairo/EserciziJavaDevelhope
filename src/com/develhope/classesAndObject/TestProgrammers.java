package com.develhope.classesAndObject;

public class TestProgrammers {

	public static void main(String[] args) {
		Programmer firstProgr = new Programmer();
		Programmer secondProgr = new Programmer();
		
		firstProgr.name = "Nicola";
		firstProgr.age = 30;
		firstProgr.wearsGlasses = true;
		
		secondProgr.name = "Lucia";
		secondProgr.age = 18;
		secondProgr.wearsGlasses = false;
		
		firstProgr.drinkCoffe();
		firstProgr.printDetails();
		
		secondProgr.printDetails();
		secondProgr.hasGlasses();
	}
}
