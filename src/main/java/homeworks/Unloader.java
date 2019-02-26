package homeworks;

import java.util.concurrent.TimeUnit;

public class Unloader implements Runnable {
  private static final int UNLOADING_SPEED = 2;
  private String name;
  private Truck truck;

  public Unloader(String name, Truck truck) {
    this.name = name;
    this.truck = truck;
    new Thread(this).start();
  }

  @Override
  public void run() {
    truck.unloadTruck(UNLOADING_SPEED);
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
