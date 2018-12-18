package homeworks;

public class Main {
  public static void main(String[] args) {
    Cart cart = new Cart();
    Customer customer = new Customer();

    Product product1 = new Product("Bread", 13);
    Product product2 = new Product("Bread", 10);
    Product product3 = new Product("Semki", 10);
    Product product4 = new Product("Milk", 5);
    Product product5 = new Product("Milk", 5);

    if (customer != null) {
      customer.getInfo();
      System.out.println();

      customer.addProductToCart(product1);
      customer.addProductToCart(product2);
      customer.addProductToCart(product3);
      customer.addProductToCart(product4);
      customer.addProductToCart(product5);
      customer.getInfo();
      System.out.println();

      customer.deleteProductByName("Bread");
      customer.getInfo();
    }
  }

}
