package com.develhope.esercizioStatic;

public class Employee {
	String name, surname ,address;

	public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
		this.name = newEmployeeName;
		this.surname = newEmployeeSurname;
		this.address = newEmployeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", address=" + address + "]";
	}
}