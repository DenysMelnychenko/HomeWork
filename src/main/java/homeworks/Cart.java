package homeworks;

public class Cart {
	private Product[] products = new Product[10];

	public void addProduct(Product product) {
		if (!product.equals(null)) {
			for (int i = 0; i < products.length; i++) {
				if (products[i].equals(null)) {
					products[i] = product;
					break;
				} else {
					continue;
				}
			}
		} else {
			System.out.println("Product can't be null. Please create product Before use it!");
		}
	}

	public void getInfo() {
		int productCounter = 0;
		for (int i = 0; i < products.length; i++) {
			if (!products[i].equals(null)) {
				productCounter++;
			}
		}
		if (productCounter == 0) {
			System.out.println("Cart is Empty.");
		} else {
			for (int i = 0; i < products.length; i++) {
				if (!products[i].equals(null)) {
					products[i].getInfo();
				}
			}
		}
	}

	public int total() {
		int total = 0;
		for (int i = 0; i < products.length; i++) {
			if (!products[i].equals(null)) {
				total += products[i].getPrice();
			}
		}
		return total;
	}

	public void deleteByName(String name) {
		if (name.equals(null)) {
			System.out.println("Wrong input Parametr. Try More!");
		} else {
			for (int i = 0; i < products.length; i++) {
				if (!products[i].getName().equals(name)) {
					continue;
				} else {
					products[i] = null;
				}
			}
		}
	}
}
