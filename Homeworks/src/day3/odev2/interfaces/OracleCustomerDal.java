package day3.odev2.interfaces;

public class OracleCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Added to sql : Oracle");
	}
	
}
