package homeworks;

import java.util.concurrent.TimeUnit;

public class Loader implements Runnable {

  private String name;
  private Sand sand;
  private Truck truck;
  private static final int LOADING_SPEED = 3;



  public Loader(String name, Sand sand, Truck truck) {
    this.name = name;
    this.sand = sand;
    this.truck = truck;
    new Thread(this).start();
  }



  @Override
  public void run() {
    while (sand.getAmount() > 0) {
      takeSand(LOADING_SPEED);
      putSandToTheTruck();
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException ignore) {
      }
    }

  }

  public void takeSand(int value) {
    if (sand.getAmount() >= 3) {
      sand.setAmount(sand.getAmount() - value);
      System.out.println(name + " take " + value + " kg of sand");
    } else if (sand.getAmount() > 0 && sand.getAmount() < 3) {
      value = sand.getAmount();
      sand.setAmount(sand.getAmount() - value);
      System.out.println("take " + value + " kg of sand");
    } else {
      System.out.println("Nothing to take. Sand is over");
    }
  }

  public void putSandToTheTruck() {
    truck.loadTruck(LOADING_SPEED);
  }


}
