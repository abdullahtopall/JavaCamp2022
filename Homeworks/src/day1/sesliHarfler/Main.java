package day1.sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='F';
		
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalin sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Ince sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");
				
		}
	}

}
