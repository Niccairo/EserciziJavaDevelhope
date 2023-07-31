package com.develhope.interfaces;

public class Student extends CollegePerson implements LearningPerson {
	private int academicYear;  
	
	public Student(String name,String surname,double collegeId,int academicYear ) {
		super(name,surname,collegeId);
		this.academicYear = academicYear;
	}

	@Override
	public void studyAtHome() {
		System.out.println("I'm studing at home");
	}

}
