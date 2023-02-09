package task;

public class Product {
	
	private int price;
	private double weight;
	private String description;
	
	public Product(int price, double weight, String description) {
		super();
		this.price = price;
		this.weight = weight;
		this.description = description;
	}

	public Product() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", weight=" + weight + ", description=" + description + "]";
	}
	
}
