package homeworks;

public class Marksmen extends Hero {
  private String name;

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

  @Override
  public String toString() {
    return "Marksmen [Name = " + name + ", Intelegence =" + getIntelegence() + ", Agility = "
        + getAgility() + ", Strength = " + getStrength() + ", Health = " + getHealth() + "]";
  }

}
