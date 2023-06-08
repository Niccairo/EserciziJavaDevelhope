package com.develhope.introduction;

public class Esercizio6 {
	public static void main(String[] args) {
		String string1 = "Hello";
		String string2 = "How Are You?";
		if (string1.length()>2 && string2.length()>2) {
			char c1 = string1.charAt(0);
			char c2 = string1.charAt(1);
			char c3 = string2.charAt(string2.length()-2);
			char c4 = string2.charAt(string2.length()-1);
			char[] arrayChar = {c1,c2,c3,c4};
			System.out.println(arrayChar);
		} else {
			System.out.println("Una delle stringhe ha una lunghezza inferiore a 2");
		}
		
		
		
	}
	

}

