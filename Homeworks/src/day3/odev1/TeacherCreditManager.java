package day3.odev1;

public class TeacherCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Öğretmen Kredisi Hesaplandı");
		
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}

}
