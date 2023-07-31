package com.develhope.ObjectClass;

public class Tester {
	
	public static void main(String[] args) {
		
		SmartphonePrice firstPriceForProducer = new SmartphonePrice();
		SmartphonePrice firstPriceForRetail = new SmartphonePrice();
		SmartphonePrice secondPriceForProducer = new SmartphonePrice();
		SmartphonePrice secondPriceForRetail = new SmartphonePrice();

		Smartphone iPhone7 = new Smartphone("Apple", "IPhone7", 1000, firstPriceForProducer , firstPriceForRetail);
		Smartphone a14 = new Smartphone("Samsung", "a14", 1200, secondPriceForProducer, secondPriceForRetail);

		System.out.println(iPhone7);
		System.out.println(a14);

		if(iPhone7.equals(a14)) {
			System.out.println("The two smartphone are equals");
		}else {
			System.out.println("The two smartphone are different");
		}
		try {
			Smartphone a15 = a14.clone();
			System.out.println(a15);
			if(a15.equals(a14)) {
				System.out.println("The two smartphone are equals");
			}else {
				System.out.println("The two smartphone are different");
			}
		} catch(Exception exception) {
			exception.printStackTrace();
			System.err.println("Errore");
		}
	}
}
