package com.develhope.encapsulation;

import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
	
		House house1 = new House();
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter the address of the house");
		house1.setAddress(sca.nextLine());
		System.out.println("Enter the number of floors");
		house1.setNumberOfFloors(sca.nextInt());
		sca.nextLine(); 
		
		
		
		System.out.println("Enter a list of names separeted by a comma");
		String names = sca.nextLine();
		house1.setResidentsNames(names.split(","));
		

		String myString = String.join(" , ", house1.getResidentsNames() );
		System.out.println("The address is : " + house1.getAddress() + " \nThe number of floors is : " + house1.getNumberOfFloors() + "\nThe resident's name are: " + myString );
		
		String formattedString = String.format("The address is: %s , The number of floors is: %d , The resident's name are: %s " ,house1.getAddress(), house1.getNumberOfFloors() , myString);
//		String formattedString = String.format("The address is: %s , The number of floors is: %d , The resident's name are: %s " ,house1.getAddress(), house1.getNumberOfFloors() , Arrays.toString(house1.getResidentsNames()));
		System.out.println(formattedString);
		sca.close();
	}
}
