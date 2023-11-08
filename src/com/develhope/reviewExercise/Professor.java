package com.develhope.reviewExercise;

public class Professor {

	private int id;
	private String firstName;
	private String lastName;
	private String course;

	public Professor(int id, String firstName, String lastName, String course) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public Professor(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void assignGrade(Student s, int grade) {
		if(grade >=18) {
			s.addGrade(grade);
		}else {
			System.out.println("Your score is less than 18, try again");
		}

	}
}