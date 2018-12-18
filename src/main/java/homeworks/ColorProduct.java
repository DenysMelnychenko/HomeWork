package homeworks;

public class ColorProduct extends Product {

	private String color;

	public ColorProduct(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	public void showInfo() {
		System.out.printf("Name is %1$s , Price is %2$s, Color is %3$s", super.getName(), super.getPrice(), color);
	}

	public String getColor() {
		return color;
	}
}
