package day1.loopDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti");
		
		//while
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While dongusu bitti");
		
		//do-while
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-while dongusu bitti");
		
	}

}
