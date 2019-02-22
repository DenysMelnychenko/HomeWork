package homeworks;

public class MainerMain {

  public static void main(String[] args) {
    GoldenMine goldenMine = GoldenMine.getInstance();
    Barracks barracks = new Barracks();
    barracks.createMiner(goldenMine, "A", 0);
    barracks.createMiner(goldenMine, "B", 0);
    barracks.createMiner(goldenMine, "C", 0);
    while (goldenMine.isNotEmpty()) {
      barracks.createMiner(goldenMine, "D", 10000);
    }
  }

}
