package com.develhope.introduction;

import java.time.LocalDate;

public class Esercizio14 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		
		int daysForTheEndOfTheMonth = today.lengthOfMonth() - today.getDayOfMonth();
		int daysForTheEndOfTheYear = today.lengthOfYear() - today.getDayOfYear();
		
		System.out.println(daysForTheEndOfTheYear);
		System.out.println(daysForTheEndOfTheMonth);
		
		
	}

}
