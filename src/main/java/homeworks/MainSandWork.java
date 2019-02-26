package homeworks;

public class MainSandWork {

  public static void main(String[] args) {
    Sand sand = new Sand();
    Truck truck = new Truck();
    new Loader("Loader", sand, truck);
    new Transporter("Transporter", truck);
    new Unloader("Unloader", truck);
  }

}
