package homeworks;

public class Barracks {
  private Integer counter = 0;

  public Barracks() {

  }

  public Miner createMiner(GoldenMine goldenMine, String name, int timePeriod) {
    try {
      Thread.currentThread().sleep(timePeriod);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    counter++;
    return new Miner(goldenMine, new String(name + counter.toString()));

  }
}
