package com.develhope.interfaces;

public class CollegePerson {
	private String name, surname;
	private double collegeId;

	public CollegePerson(String name, String surname, double collegeId) {
		super();
		this.name = name;
		this.surname = surname;
		this.collegeId = collegeId;
	}

	public String goToCollege() {
		return "Name =" + name + ", surname=" + surname + ", collegeId=" + collegeId; 
	}
}

