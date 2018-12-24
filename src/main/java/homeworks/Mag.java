package homeworks;

public class Mag extends Hero {
  private String name;

  public Mag(String name, int intelegence, int agility, int strenth, int health) {
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
    return "Mag [Name = " + name + ", Intelegence = " + getIntelegence() + ", Agility = "
        + getAgility() + ", Strength = " + getStrength() + ", Health = " + getHealth() + "]";
  }


}
