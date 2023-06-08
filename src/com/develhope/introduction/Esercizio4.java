package com.develhope.introduction;

public class Esercizio4 {

	public static void main(String[] args) {
		int a = 15;
		a += 5;
		System.out.println("il valore di a è : "+ a);
		a -= 4;
		System.out.println("il valore di a è : "+ a);
		int b = a; b++;
		System.out.println("il valore di b è : "+ b);
		
		if(b % 2 !=0 && b*(b+1)%3 ==0) {
			System.out.println("entrambi gli statement sono true");
		}
		else {
			System.out.println("almeno uno dei due statement non è true");
		}
	}

}
