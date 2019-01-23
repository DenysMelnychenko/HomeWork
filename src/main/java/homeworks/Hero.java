package homeworks;

public abstract class Hero {
  private Item[] bag;
  private int intelegence;
  private int agility;
  private int strength;
  private int strike;
  private int health;


  public Hero(int intelegence, int agility, int strenth, int health) {
    this.intelegence = intelegence;
    this.agility = agility;
    this.strength = strenth;
    this.health = health;
    bag = new Item[2];
  }

  public int getIntelegence() {
    return intelegence;
  }

  public void setIntelegence(int intelegence) {
    this.intelegence = intelegence;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strenth) {
    this.strength = strenth;
  }

  public int getHealth() {

    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public Item[] getBag() {
    return bag;
  }

  public void setItem(Item item) {
    if (item != null) {
      for (int i = 0; i < bag.length; i++) {
        if (bag[i] == null) {
          bag[i] = item;
          intelegence += bag[i].getIntelegence();
          agility += bag[i].getAgility();
          strength += bag[i].getStrength();
          health += bag[i].getHealth();
        }

      }
    }
  }

  abstract int ultimate();

  protected abstract int getStrike();

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (int) (prime * result + agility);
    result = (int) (prime * result + health);
    result = (int) (prime * result + intelegence);
    result = (int) (prime * result + strength);
    result = (int) (prime * result + strike);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Hero other = (Hero) obj;
    if (agility != other.agility)
      return false;
    if (health != other.health)
      return false;
    if (intelegence != other.intelegence)
      return false;
    if (strength != other.strength)
      return false;
    if (strike != other.strike)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Hero [intelegence=" + intelegence + ", agility=" + agility + ", strenth=" + strength
        + ", strike=" + strike + ", health=" + health + "]";
  }

  protected abstract Object getName();


}
