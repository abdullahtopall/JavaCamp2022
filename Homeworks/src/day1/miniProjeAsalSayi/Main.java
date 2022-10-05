package day1.miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 2;
		boolean asalMi = true;
		
		if(number ==1) {
			System.out.println("Sayi asal degil");
			return;
		}
			
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				asalMi = false;
			}
		}
		if(asalMi) {
			System.out.println("Sayi asal");
		} else {
			System.out.println("Sayi asal degil");
		}
	}

}
