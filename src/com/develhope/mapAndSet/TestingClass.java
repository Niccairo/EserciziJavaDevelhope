package com.develhope.mapAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestingClass {

	public static void main(String[] args) {
		Map<String, Integer> months = new LinkedHashMap<>();
		months.put("January", 1);
		months.put("February", 2);
		months.put("March", 3);
		months.put("April", 4);
		months.put("May", 5);
		months.put("June", 6);
		months.put("July", 7);
		months.put("August", 8);
		months.put("September", 9);
		months.put("October", 10);
		months.put("November", 11);
		months.put("December", 12);
		
		for (String x : months.keySet()) {
			System.out.println(x);
		}
		
		List<Integer> cardinalMonth = new ArrayList<>(months.values());
		System.out.println(cardinalMonth);
		
		Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
		System.out.println(Arrays.toString(cardinalMonthArray));
	}

}
