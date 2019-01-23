package homeworks;

public class Battle {

  public static void main(String[] args) {
    HeroGenerantor hr = new HeroGenerantor();
    ItemGenerator ig = new ItemGenerator();
    Dota2Engine dota2Engine = new Dota2Engine();
    Hero hero1 = hr.createHero("Mag", "mag", 100);
    Hero hero2 = hr.createHero("Sniper", "sniper", 100);
    Item wand = ig.createItem("Wand", 100);
    Item hat = ig.createItem("Hat", 100);
    Item bow = ig.createItem("Bow", 100);
    Item boots = ig.createItem("Boots", 100);
    hero1.setItem(wand);
    hero1.setItem(hat);
    hero2.setItem(bow);
    hero2.setItem(boots);
    dota2Engine.battle(hero1, hero2);
  }

}
