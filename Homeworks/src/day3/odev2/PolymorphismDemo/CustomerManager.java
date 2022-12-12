package day3.odev2.PolymorphismDemo;

public class CustomerManager {

	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}

	public void add(String logMessage) {
		System.out.println("Müşteri eklendi");
		this.baseLogger.Log(logMessage);

	}
}
