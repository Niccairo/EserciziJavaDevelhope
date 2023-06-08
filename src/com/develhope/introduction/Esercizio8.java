package com.develhope.introduction;

public class Esercizio8 {

	public static void main(String[] args) {
		boolean firstBool = 2<=2 && !true;
		System.out.println(firstBool);
		
		boolean secondBool = !false && 3 > 2;
        System.out.println(secondBool);
        
        boolean t = false;
        boolean f = true;
        boolean thirdBool = !(!t || f);
        System.out.println(thirdBool);
        
        boolean fourthBool = 6 > 6 ^ !(true && true);
        System.out.println(fourthBool);
	}

}
