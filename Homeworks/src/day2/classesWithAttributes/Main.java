package day2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Msi Laptop", 3000, 3, "Siyah");

		System.out.println(product.getName());

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
