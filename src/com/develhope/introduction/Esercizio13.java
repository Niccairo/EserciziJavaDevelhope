package com.develhope.introduction;

public class Esercizio13 {

	public static void main(String[] args) {
		int poundsOfBot = 10000;
		int dayCounter = 0;

		while(poundsOfBot >= 1000 ) {
			double exchangeRate = 1 + (Math.random() * 0.2);
			if(exchangeRate > 1.15) {
				poundsOfBot -= 1000;
				System.out.println("Gooood.. you have sold 1000 pounds at an exchange rate equal to ( "
							+ exchangeRate + ") and now your pounds are " + poundsOfBot );
			}else {
				System.out.println("This is sad, you didn't sold pounds today because the exchange rate (" 
			
						+ exchangeRate + ") was lower then 1.15" );
			}
			dayCounter++;
		}
		System.out.println("Days taken to sell pounds are : " + dayCounter);
		System.out.println("The pounds left are : " + poundsOfBot);
	}
}
