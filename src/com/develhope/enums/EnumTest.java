package com.develhope.enums;

public class EnumTest {

	public static void main(String[] args) {
		
		for (Months month : Months.values()) {
			
			if(month.name().endsWith("Y")) {
				System.out.println(month + " end with Y");
			}else {
				System.out.println(month + " doesn't end with Y");
			}
		}
	}
	
	

}
