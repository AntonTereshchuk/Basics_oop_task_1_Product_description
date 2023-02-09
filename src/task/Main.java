package task;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(100, 1.5, "Winter jacket");
		System.out.println(product1.toString());
		
		Product product2 = new Product(25, 0.3, "Autumn hat");
		System.out.println(product2.toString());
		
		System.out.println();
		
		product2.setPrice(90);
		System.out.println(product2.getPrice());
		product2.setDescription("Winter jacket with discount");
		System.out.println(product2.getDescription());
		System.out.println(product2.toString());

	}

}
