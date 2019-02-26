package homeworks;

public class Transporter implements Runnable {
  private String name;
  private Truck truck;

  public Transporter(String name, Truck truck) {
    this.name = name;
    this.truck = truck;
    new Thread(this).start();
  }

  @Override
  public void run() {
    truck.moveForward();
    truck.moveBack();
  }
}
