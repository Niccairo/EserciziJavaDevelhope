package com.develhope.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testingcalculator {

	@Test
	void tenMinusSixResult() {
		assertEquals(4.0 , Calculator.subtraction(10.0,6.0)); 
	}
	
	@Test
	void eightPointFiveMinusThreePointFiveResult() {
		assertEquals(5 , Calculator.subtraction(8.5,3.5d)); 
	}
	@Test 
	void twoByTwoResult() {
		assertEquals(4d , Calculator.multiplicator(2d,2d)); 
	}
	@Test 
	void fourPointFiveByTwoPointFiveResult() {
		assertEquals(11.25 , Calculator.multiplicator(4.5,2.5d)); 
	}
	
}
