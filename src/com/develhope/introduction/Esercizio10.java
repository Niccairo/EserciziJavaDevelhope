package com.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Esercizio10 {

	public static void main(String[] args) {
		List<String> carBrands = Arrays.asList("Ferrari","Mercedes","Audi","Lamborghini","Bmw");
		System.out.println(carBrands.size());
		System.out.println(carBrands.get(2));
		
		ArrayList<Integer> primeNumbers = new ArrayList<>(6) ;
		primeNumbers.add(10);
		primeNumbers.add(20);
		primeNumbers.add(30);
		primeNumbers.add(40);
		primeNumbers.add(50);
		primeNumbers.add(60);
		
		System.out.println(primeNumbers);
	}
}
