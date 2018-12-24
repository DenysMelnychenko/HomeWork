package homeworks;

public class Battle {

  public static void main(String[] args) {
    Mag hero1 = new Mag("Mag", generate(100), generate(100), generate(100), generate(1000));
    Marksmen hero2 =
        new Marksmen("Marksmen", generate(100), generate(100), generate(100), generate(1000));
    Item wand = new Item("Wand", generate(100), generate(100), generate(100), generate(1000));
    Item hat = new Item("Hat", generate(100), generate(100), generate(100), generate(1000));
    Item bow = new Item("Bow", generate(100), generate(100), generate(100), generate(1000));
    Item boots = new Item("Boots", generate(100), generate(100), generate(100), generate(1000));
    hero1.setItem(wand);
    hero1.setItem(hat);
    hero2.setItem(bow);
    hero2.setItem(boots);

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

  private static int generate(int range) {
    return (int) (Math.random() * range);
  }

}
