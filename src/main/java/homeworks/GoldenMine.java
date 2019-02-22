package homeworks;

public class GoldenMine {
  private volatile int goldAmmount = 1000;
  private boolean notEmpty = true;

  private GoldenMine() {}

  // Inner class to provide instance of class
  private static class BillPughSingleton {
    private static final GoldenMine INSTANCE = new GoldenMine();
  }

  public static GoldenMine getInstance() {
    return BillPughSingleton.INSTANCE;
  }

  public int getGoldAmmount() {
    synchronized (this) {
      return goldAmmount;
    }

  }

  public void setGoldAmmount(int goldAmmount) {
    synchronized (this) {
      this.goldAmmount = goldAmmount;
    }
  }

  public boolean isNotEmpty() {
    synchronized (this) {
      return notEmpty;
    }
  }

  public void setNotEmpty(boolean notEmpty) {
    synchronized (this) {
      this.notEmpty = notEmpty;
    }
  }


}
