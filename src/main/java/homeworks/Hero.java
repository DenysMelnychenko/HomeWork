package homeworks;

public class Hero {
  private double intelegence;
  private double agility;
  private double strenth;
  private double strike = intelegence / 3 + agility / 2 + strenth;
  private double health;

  public Hero(double intelegence, double agility, double strenth, double health) {
    super();
    this.intelegence = intelegence;
    this.agility = agility;
    this.strenth = strenth;
    this.health = health;
  }

  public double getIntelegence() {
    return intelegence;
  }

  public void setIntelegence(double intelegence) {
    this.intelegence = intelegence;
  }

  public double getAgility() {
    return agility;
  }

  public void setAgility(double agility) {
    this.agility = agility;
  }

  public double getStrenth() {
    return strenth;
  }

  public void setStrenth(double strenth) {
    this.strenth = strenth;
  }

  public double getHealth() {
    return health;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public double getStrike() {
    return strike;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (int) (prime * result + agility);
    result = (int) (prime * result + health);
    result = (int) (prime * result + intelegence);
    result = (int) (prime * result + strenth);
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
    if (strenth != other.strenth)
      return false;
    if (strike != other.strike)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Hero [intelegence=" + intelegence + ", agility=" + agility + ", strenth=" + strenth
        + ", strike=" + strike + ", health=" + health + "]";
  }


}
