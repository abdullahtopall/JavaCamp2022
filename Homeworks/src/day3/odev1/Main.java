package day3.odev1;

public class Main {

	public static void main(String[] args) {
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		System.out.println(sayi1);
//
//		int[] sayilar1 = { 1, 2, 3 };
//		int[] sayilar2 = { 10, 20, 30 };
//		sayilar1 = sayilar2;
//		sayilar2[0] = 1000;
//		System.out.println(sayilar1[0]);
//
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//
//		Customer customer1 = new Customer();
//		customer1.setId(1);
//		customer1.setCity("İstanbul");
//		
//		Company company = new Company();
//		company.setTaxNumber("100000");
//		company.setCompanyName("Arçelik");
//		company.setId(100);
//		
//		CustomerManager customerManager = new CustomerManager(customer1);
//		customerManager.save();
//		customerManager.delete();
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//	
//		
//		Person person = new Person();
//		person.setFirstName("Furkan");
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
		
		
	}

}
