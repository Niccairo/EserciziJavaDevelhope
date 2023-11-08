package com.develhope.reviewExercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Student mario = new Student(1, "Mario", "Rossi", LocalDate.of(1993, 12, 30));
		Student luca = new Student(2, "Luca", "Bianchi", LocalDate.of(2005, 1, 12));
		Student nicola = new Student(3, "Nicola", "Verdi", LocalDate.of(1985, 8, 5));
		Student ciro = new Student(4, "Ciro", "Neri", LocalDate.of(2002, 6, 17),new ArrayList<>());
		Student michele = new Student(5, "Michele", "Azzurri", LocalDate.of(1958, 5, 22), new ArrayList<>());
		Professor profGerardo = new Professor(1, "Gerardo", "Califano");
		Professor profAntonio = new Professor(1, "Antonio", "Tortora","Geografia");
		profGerardo.assignGrade(ciro, 22);
		profGerardo.assignGrade(ciro, 15);
		profGerardo.assignGrade(michele, 28);
		profGerardo.assignGrade(luca, 20);
		profGerardo.assignGrade(mario, 30);
		profGerardo.assignGrade(nicola, 25);

		List<Student> studentList = new ArrayList<>();
		studentList.add(michele);
		studentList.add(ciro);
		studentList.add(nicola);
		studentList.add(luca);
		studentList.add(mario);

		List<Professor> professorList = new ArrayList<>();
		professorList.add(profGerardo);
		professorList.add(profAntonio);

		for(Student student : studentList) {
			if(student.isExcellent()) {
				System.out.println("Excellent student : " + student.getFirstName() + " " + student.getLastName()); 
			}
		}

		Student studentWithTheBestAverage = studentList.get(0);
		for(Student student : studentList) {
			if(student.calculateGradeAverage()> studentWithTheBestAverage.calculateGradeAverage()) {
				studentWithTheBestAverage = student;
			}
		}
		System.out.println("Student with best average : " + studentWithTheBestAverage.getFirstName() + " " + studentWithTheBestAverage.getLastName());
	}
}
