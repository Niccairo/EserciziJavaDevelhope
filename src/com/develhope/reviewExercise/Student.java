package com.develhope.reviewExercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	List<Integer> gradesObtained;

	public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, List<Integer> gradesObtained) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gradesObtained = gradesObtained;
	}

	public Student(int id, String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gradesObtained = new ArrayList<>();
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Integer> getGradesObtained() {
		return gradesObtained;
	}

	public void setGradesObtained(List<Integer> gradesObtained) {
		this.gradesObtained = gradesObtained;
	}
	public void addGrade(int grade) {
		this.gradesObtained.add(grade);
	}

	public int calculateGradeAverage() {
		int totalValue = 0;
		int num = 0;
		for (Integer integer : gradesObtained) {
			totalValue += integer;
			num++;
		}
		return totalValue/num;
	}

	public boolean isExcellent(){
		int gradeAverage = calculateGradeAverage();
		if(gradeAverage >= 28) {
			return true;
		}
		return false;
	}
}