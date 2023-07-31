package com.develhope.interfaces;

public class TestingClass {
	
	public static void main(String[] args) {
		Professor prof1 = new Professor("Mario", "Rossi", 145, "geography");
		Student stud1 = new Student("Nicola", "Verdi", 101, 2);
		Assistant ass1 = new Assistant("Giulia", "Neri", 322, true);
		prof1.goToCollege();
		stud1.goToCollege();
		ass1.goToCollege();
		prof1.teachToOtherPeople();
	    stud1.studyAtHome();
	    ass1.studyAtHome();
	    ass1.teachToOtherPeople();
	}
}
