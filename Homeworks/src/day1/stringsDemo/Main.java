package day1.stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayisi: "+mesaj.length());
		System.out.println("5.eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" .Yasasin!"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // mesajin 0 dan 5. ye kadar karakterlere at.
		
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a')); // a kacinci karakter?
		System.out.println(mesaj.lastIndexOf('a')); // a sondan kacinci karakter
		
		System.out.println("--------------------------------");
		
		
		System.out.println(mesaj.replace(' ','-')); //degistirme
		
		System.out.println(mesaj.substring(2,5));  // 2 den başla 5 ' e kadar
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(mesaj);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); //bosluklari siler
		
	}

}
