package day1.arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Abdullah";
		String ogrenci2 = "Engin";
		String ogrenci3 = "Furkan";
		String ogrenci4 = "Taha";
		
		String[] ogrenciler = new String[] {ogrenci1,ogrenci2,ogrenci3,ogrenci4};
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
