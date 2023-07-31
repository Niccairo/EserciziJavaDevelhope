package com.develhope.interfaces;

public class Professor extends CollegePerson implements TeachingPerson{
	
	private String teachingSubject;
	
	public Professor(String name, String surname, double collegeId,String teachingSubject) {
		super(name, surname, collegeId);
		this.teachingSubject = teachingSubject;
	}

	@Override
	public void teachToOtherPeople() {
		System.out.println("I'm teaching to the students");
	}
	
}
