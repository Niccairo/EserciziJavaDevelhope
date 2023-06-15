package com.develhope.introduction;

public class Esercizio13 {

	public static void main(String[] args) {
		int poundsOfBot = 10000;
		int dayCounter = 0;

		while(poundsOfBot > 0 ) {
			double exchangeRate = 1 + (Math.random() * 0.2);
			if(exchangeRate > 1.15) {
				poundsOfBot -= 1000;
			}
			dayCounter++;
		}
		System.out.println("Days taken to sell pounds are : " + dayCounter);
		System.out.println("The pounds left are : " + poundsOfBot);
	}
}
