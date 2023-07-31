package com.develhope.interfaces;

public class Assistant extends CollegePerson implements TeachingPerson,LearningPerson {
	
	private boolean isGoingToBeAPhD;
	
	public Assistant(String name, String surname, double collegeId,boolean isGoingToBeAPhD) {
		super(name, surname, collegeId);
		this.isGoingToBeAPhD = isGoingToBeAPhD;
	}
	
	@Override
	public void studyAtHome() {
		System.out.println("I'm studying because I want to become a professor");
		
	}

	@Override
	public void teachToOtherPeople() {
		System.out.println("I'm teaching to the students although I'm not yet a professor");
		
	}
}
