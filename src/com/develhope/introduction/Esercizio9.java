package com.develhope.introduction;

import java.util.Scanner;

public class Esercizio9 {
	public static void main(String[] args) {
		// creo lo scanner che mi serve per chiedere all'utente di inserire un numero
		Scanner sca = new Scanner(System.in);
		System.out.println("Inserisci un numero da 1 a 10");
		// salvo il numero inserito dall'utente nella variabile numero
		int numero = sca.nextInt();

		switch (numero) {
		case 1 :
			System.out.println("Il numero è uno" );
			break;
			
		case 2 :
			System.out.println("Il numero è due" );
			break;
			
		case 3 :
			System.out.println("Il numero è tre" );
			break;
			
		case 4 :
			System.out.println("Il numero è quattro");
			break;
			
		case 5 :
			System.out.println("Il numero è cinque");
			break;
			
		case 6 :
			System.out.println("Il numero è sei");
			break;
			
		case 7 :
			System.out.println("Il numero è sette" );
			break;
			
		case 8 :
			System.out.println("Il numero è otto");
			break;
			
		case 9 :
			System.out.println("Il numero è nove");
			break;
			
		case 10 :
			System.out.println("Il numero è dieci");
			break;	
		default :
			System.out.println("Non posso darti il numero");
		}
		sca.close();
	}
}
