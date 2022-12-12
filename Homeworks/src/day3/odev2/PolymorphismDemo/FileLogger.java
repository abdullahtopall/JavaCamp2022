package day3.odev2.PolymorphismDemo;

public class FileLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logged to file: "+message);
	}
}
