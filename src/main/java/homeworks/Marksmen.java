package homeworks;

public class Marksmen extends Hero {
  private String name;
  private static double ultimateChance = 0.35;

  public Marksmen(String name, int intelegence, int agility, int strenth, int health) {
    super(intelegence, agility, strenth, health);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStrike() {
    return getIntelegence() / 3 + getAgility() / 2 + getStrength() + ultimate();
  }

  protected int ultimate() {
    if ((int) ultimateChance >= 1) {
      ultimateChance = 0.35;
      return 2 * getStrike();
    }
    ultimateChance++;
    return 0;

  }

  @Override
  public String toString() {
    return "Marksmen [Name = " + name + ", Intelegence =" + getIntelegence() + ", Agility = "
        + getAgility() + ", Strength = " + getStrength() + ", Health = " + getHealth()
        + " Strike = " + getStrike() + "]";
  }

}
