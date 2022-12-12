package day3.odev2.interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("Added to sql : MySql");
	}
	
}
