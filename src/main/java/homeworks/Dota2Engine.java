package homeworks;

public class Dota2Engine {

  public void battle(Hero hero1, Hero hero2) {
    while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
      hero2.setHealth((hero2.getHealth() - hero1.getStrike()));
      try {
        Thread.sleep(1000);
        System.out.println(hero2.toString());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      hero1.setHealth((hero1.getHealth() - hero2.getStrike()));
      try {
        Thread.sleep(1000);
        System.out.println(hero1.toString());
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println((hero1.getHealth() > 0) ? String.format("%1$s WIN", hero1.getName())
        : String.format("%1$s WIN", hero2.getName()));
  }

}
