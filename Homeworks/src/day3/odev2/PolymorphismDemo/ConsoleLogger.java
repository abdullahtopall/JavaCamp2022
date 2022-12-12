package day3.odev2.PolymorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logged to console: "+message);
	}
}
