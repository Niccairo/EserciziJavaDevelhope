package com.develhope.esercizioStatic;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Employee empolyee1 = new Employee("Ciro", "Califano", "Via Mangioni");
		Employee empolyee2 = new Employee("Marco", "Ruotolo", "Via Tramontano");
		Badge badge1 = new Badge(empolyee1);
		Badge badge2 = new Badge(empolyee2);
		badge1.showBadgeDetails();
		badge2.showBadgeDetails();
	}
}
