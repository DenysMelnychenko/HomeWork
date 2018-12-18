package homeworks;

public class Battle {

  public static void main(String[] args) {
    Hero hero1 = new Mag(randomStatsGenerator(1000), randomStatsGenerator(1000),
        randomStatsGenerator(1000), randomStatsGenerator(1000));
    Hero hero2 = new Marksmen(randomStatsGenerator(1000), randomStatsGenerator(1000),
        randomStatsGenerator(1000), randomStatsGenerator(1000));
    Item wand = new Item();
    Item cap = new Item();
    Item bow = new Item();
    Item boots = new Item();

    while (hero1.getHealth() >= 0 && hero1.getHealth() >= 0F) {
      hero2.setHealth(hero1.getStrike());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(hero2.toString());
        e.printStackTrace();
      }
      hero1.setHealth(hero2.getStrike());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(hero2.toString());
        e.printStackTrace();
      }
    }
    System.out.println((hero1.getHealth() > 0) ? "Hero1 WIN" : "Herow 2 WIN");
  }

  private static double randomStatsGenerator(double bords) {
    return Math.random() * bords;
  }

}
