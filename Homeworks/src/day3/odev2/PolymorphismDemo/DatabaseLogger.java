package day3.odev2.PolymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logged to database: "+message);
	}
}
