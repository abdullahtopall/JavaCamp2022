package day1.arkadasSayilar;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 220;
		int number2 = 284;
		
		int number1Bolum = 0;
		int number2Bolum = 0;
		
		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				number1Bolum += i;
			}
		}
		
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				number2Bolum += i;
			}
		}
		
		
		if(number1 == number2Bolum && number2 == number1Bolum) {
			System.out.println(number1+" ve "+number2+" arkadas sayilardir");
		} else {
			System.out.println(number1+" ve "+number2+" arkadas sayilar degildir");  
		}
		
		
		
	}

}
