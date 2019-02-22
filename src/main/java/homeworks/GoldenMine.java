package homeworks;

public class GoldenMine {
  private int goldAmmount = 1000;
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
    return goldAmmount;
  }

  public void setGoldAmmount(int goldAmmount) {
    this.goldAmmount = goldAmmount;
  }

  public boolean isNotEmpty() {
    return notEmpty;
  }

  public void setNotEmpty(boolean notEmpty) {
    this.notEmpty = notEmpty;
  }


}
