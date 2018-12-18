package homeworks;

public class Product {
	private String name;
	private int price;

	public Product() {

	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return String.format("Name is %1$s , Price is %2$s", name, price);
	}

	public void showInfo() {
		System.out.printf("Name is %1$s , Price is %2$s", name, price);
	}

}
