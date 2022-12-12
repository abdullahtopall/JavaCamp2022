package day3.odev2.PolymorphismDemo;

public class EmailLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logged to email: "+message);
	}
}
