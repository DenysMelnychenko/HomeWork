package homeworks;

public class Miner implements Runnable {

  private String name;
  private GoldenMine goldMine;
  private final static int SPEED_OF_MINING = 3;
  private int amountOfGold = 0;


  public Miner(GoldenMine goldenMine, String name) {
    this.goldMine = goldenMine;
    this.name = name;
    new Thread(this).start();
  }

  @Override
  public void run() {
    while (goldMine.isNotEmpty()) {
      if (goldMine.getGoldAmmount() == 1) {
        setMinerAmountOfGold(goldMine.getGoldAmmount());
        goldMine.setNotEmpty(false);
        System.out.printf("Miner %s mined the last one  and he got %d gramms of gold!  \n", name,
            amountOfGold);
      } else {
        setMinerAmountOfGold(SPEED_OF_MINING);
        goldMine.setGoldAmmount(goldMine.getGoldAmmount() - SPEED_OF_MINING);
        System.out.printf("Miner %1$s mined %2$d \n", name, amountOfGold);
        try {
          System.out.printf("There are %d more gold in mine \n", goldMine.getGoldAmmount());
          Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    Thread.currentThread().interrupt();
  }

  public int getMinerAmountOfGold() {
    return amountOfGold;
  }

  public void setMinerAmountOfGold(int amountOfGold) {
    this.amountOfGold += amountOfGold;
  }



}
