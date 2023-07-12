package com.develhope.HandlingExceptions;

public class Test {

	public static void main(String[] args) {
		metodo1(10);
		metodo1(95.2);
		metodo1(100.01);
	}
	
	private static void metodo1(double score) {
		if(score>0 && score<=50) {
			System.out.println("Average Score");
		}else if(score >50 && score <=100) {
			System.out.println("Very good score");
		}else {
			try {
				throw new ArithmeticException();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
	}
}
