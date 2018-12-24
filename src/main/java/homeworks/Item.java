package homeworks;

public class Item {
  private String name;
  private int intelegence;
  private int agility;
  private int strength;
  private int health;

  public Item(String name, int intelegence, int agility, int strength, int health) {
    this.name = name;
    this.intelegence = intelegence;
    this.agility = agility;
    this.strength = strength;
    this.health = health;

  }

  public int getIntelegence() {
    return intelegence;
  }

  public int getAgility() {
    return agility;
  }

  public int getStrength() {
    return strength;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  @Override
  public String toString() {
    return "Item [name=" + name + ", intelegence=" + intelegence + ", agility=" + agility
        + ", strenth=" + strength + ", health=" + health + "]";
  }

}
