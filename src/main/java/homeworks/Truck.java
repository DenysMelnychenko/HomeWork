package homeworks;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Truck {
  private static final int CAPASITY = 6;
  private int currentAmount = 0;
  private Semaphore loader = new Semaphore(1);
  private Semaphore transporter = new Semaphore(0);
  private Semaphore unloader = new Semaphore(0);

  public int getCurrentAmount() {
    return currentAmount;
  }

  public void loadTruck(int amount) {
    try {
      loader.acquire();
    } catch (InterruptedException ignore) {
      ignore.printStackTrace();
    }
    if (currentAmount >= CAPASITY) {
      System.out.println("Truck is full");
      transporter.release();
    } else
      currentAmount += amount;
    loader.release();
  }

  public void unloadTruck(int amount) {
    try {
      unloader.acquire();
    } catch (InterruptedException ignore) {
      ignore.printStackTrace();
    }
    if (currentAmount <= CAPASITY) {
      currentAmount -= amount;
      System.out.println("Unloading truck");
      unloader.release();
    } else if (currentAmount == 0) {
      System.out.println("Finished unload");
      transporter.release();
    }
  }

  public void moveForward() {
    try {
      transporter.acquire();
      loader.acquire();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Start moving to unloader");
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Arrived to unloader");
    unloader.release();
  }

  public void moveBack() {
    try {
      transporter.acquire();
      loader.acquire();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Start moving from unloader");
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Arrived to loader");
    loader.release();
  }



}
