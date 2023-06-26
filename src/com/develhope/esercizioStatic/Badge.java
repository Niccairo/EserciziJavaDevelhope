package com.develhope.esercizioStatic;

import java.util.Random;

public class Badge {
	private static int totalNumberOfEmployees;
	private String badgeIdCode;
	public Employee employee;
	
	public Badge(Employee employeeThatNeedsBadge) {
		keepTrackOfEmployeesNumber();
		this.employee = employeeThatNeedsBadge;
		this.badgeIdCode = generateBadgeIdCode();
	}
	
	private static void keepTrackOfEmployeesNumber() {
		totalNumberOfEmployees++;
	}
	
	private String generateBadgeIdCode() {
		
		String values = "XYZTFW";
		Random random = new Random();
		StringBuilder myString = new StringBuilder();
		for (int x = 0; x < 3 ; x++) {
			int i = random.nextInt(values.length());
			char myChar = values.charAt(i);
			myString.append(myChar);
		}
		return myString + employee.name + employee.surname + myString;
	}
	
	public void showBadgeDetails() {
		System.out.println("Il numero dei dipendenti monitorati dai badge è : " + totalNumberOfEmployees +
				"\nIl nome del dipendente è : " +  employee.name + "\nIl cognome del dipendente è : " + employee.surname +
				"\nL'indirizzo del dipendente è : " + employee.address + "\nIl codice del tesserino  è : " + badgeIdCode );
	}
}
