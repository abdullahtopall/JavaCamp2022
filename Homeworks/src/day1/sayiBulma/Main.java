package day1.sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacakSayi = 5;
		
		for(int i=0; i<sayilar.length; i++) {
			if(aranacakSayi == sayilar[i]) {
				System.out.println("Aranacak sayi dongude mevcut");
				return;
			} 
		}
		
		System.out.println("Aranacak sayi dongude mevcut degil");

	}

}
