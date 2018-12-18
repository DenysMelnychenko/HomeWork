package homeworks;

public class WeightColorProduct extends ColorProduct {
	private String weight;

	public WeightColorProduct(String name, int price, String color, String weight) {
		super(name, price, color);
		this.weight = weight;
	}

	@Override
	public void showInfo() {
		System.out.printf("Name is %1$s , Price is %2$s, Color is %3$s Weight is %4$s", super.getName(),
				super.getPrice(), super.getColor(), weight);
	}

	public String getWeight() {
		return weight;
	}
}
