package homeworks;

public class Customer {
  private Cart cart;

  public void addProductToCart(Product product) {
    if (!cart.equals(null)) {
      cart.addProduct(product);
    } else {
      System.out.println("Cart doesn't exist. Please add Cart");
    }
  }

  public void addCart(Cart cart) {
    this.cart = cart;
  }

  public void getInfo() {
    cart.getInfo();
  }

  public void deleteProductByName(String name) {
    cart.deleteByName(name);
  }

  public Cart giveCart() {
    Cart tempCart = cart;
    this.cart = null;
    return tempCart;
  }

}
