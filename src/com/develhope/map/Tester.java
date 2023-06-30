package com.develhope.map;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class Tester {
	public static void main(String[] args) {
		Map<Integer,String> numbersInEnglish = new HashMap<>();
		numbersInEnglish.put(1, "One");
		numbersInEnglish.put(2, "Two");
		numbersInEnglish.put(3, "Three");
		numbersInEnglish.put(4, "Four");
		numbersInEnglish.put(5, "Five");
		
		Map<Integer, String> numbersInItalian = new HashMap<>();
		numbersInItalian.put(1, "Uno");
		numbersInItalian.put(3, "Tre");
		numbersInItalian.put(5, "Cinque");
		numbersInItalian.put(7, "Sette");
		numbersInItalian.put(9, "Nove");
		
		//a lezione abbiamo visto putAll che è molto più semplice, siccome non 
		// conoscevo il metodo ho fatto questo ciclo 
		for (Map.Entry<Integer,String> currEntry : numbersInItalian.entrySet() ) {
			numbersInEnglish.put(currEntry.getKey(), currEntry.getValue());	
		}
		System.out.println(numbersInEnglish);
		
		//fatto da me ma non rispetta la traccia perchè non controlla 
		// i numeri pari , fare un ciclo for come visto a lezione
		for (Integer num : numbersInEnglish.keySet()) {
			if(num>4 && num<10) {
				System.out.println(numbersInEnglish.get(num));
			}
		}
		
//		fatto a lezione con Pasquale
//		numbersInEnglish.putAll(numbersInItalian);
//		for (int i=5; i<=9;i++) {
//			if(numbersInEnglish.containsKey(i)) {
//				System.out.println();
//			}
//			else {
//				System.out.println("no value");
//			}
//		}
	}
}
