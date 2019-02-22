package homeworks;

public class MainerMain {

  public static void main(String[] args) {
    GoldenMine goldenMine = GoldenMine.getInstance();
    new Miner(goldenMine, "A");
    new Miner(goldenMine, "B");
    new Miner(goldenMine, "C");
    Integer counter = 0;
    while (goldenMine.isNotEmpty()) {
      try {
        Thread.currentThread().sleep(3000);
        counter++;
        new Miner(goldenMine, new String("D" + counter.toString()));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
