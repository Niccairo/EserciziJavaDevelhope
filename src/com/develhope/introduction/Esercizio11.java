package com.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio11 {

	public static void main(String[] args) {
		
		List<String> cityNames = Arrays.asList("Roma", "Napoli" , "Palermo");
		
		// cityNames.add("Milano");  non mi fa aggiungere un altro elemento perchè 
		// evidentemente la lista non può cambiare da come l'abbiamo dichiarata sulla linea 9
		
		cityNames.set(1, "Tegucigalpa");
		System.out.println(cityNames);
		
		List<String> kingsOfRome = new ArrayList<>();
		
		kingsOfRome.add("Francesco Totti");
		kingsOfRome.add("Numa Pompilio");
		kingsOfRome.add("Tullo Ostilio");
		kingsOfRome.add("Anco Marzio");
		kingsOfRome.add("Tarquinio Prisco");
		kingsOfRome.add("Servio Tullio");
		kingsOfRome.add("Tarquinio il Superbo");
		System.out.println(kingsOfRome);
		
		String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
		kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
		
		for (String king : kingsOfRomeArray) {
			System.out.println(king);
		}
	}
}
