package com.develhope.encapsulation;

public class House {
	private String address;
	private int numberOfFloors;
	String[] residentsNames;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public String[] getResidentsNames() {
		return residentsNames;
	}
	public void setResidentsNames(String[] residentsNames) {
		this.residentsNames = residentsNames;
	}
}
