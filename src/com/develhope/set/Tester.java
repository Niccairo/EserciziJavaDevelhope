package com.develhope.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		
		Set<String> daysOfTheWeek = new HashSet<>();
		daysOfTheWeek.add("Lunedi");
		daysOfTheWeek.add("Martedi");
		daysOfTheWeek.add("Mercoledi");
		daysOfTheWeek.add("Giovedi");
		daysOfTheWeek.add("Venerdi");
		daysOfTheWeek.add("Sabato");
		daysOfTheWeek.add("Domenica");
		System.out.println(daysOfTheWeek);
		
		Set<String> daysOfTheWeekOrdered = new LinkedHashSet<>();
		daysOfTheWeekOrdered.add("Lunedi");
		daysOfTheWeekOrdered.add("Martedi");
		daysOfTheWeekOrdered.add("Mercoledi");
		daysOfTheWeekOrdered.add("Giovedì");
		daysOfTheWeekOrdered.add("Venerdi");
		daysOfTheWeekOrdered.add("Sabato");
		daysOfTheWeekOrdered.add("Domenica");
		System.out.println(daysOfTheWeekOrdered);
		
		boolean isTheSame = daysOfTheWeek.equals(daysOfTheWeekOrdered);
		System.out.println("Is the first Set equal to the second one? " + isTheSame);
	}
}
