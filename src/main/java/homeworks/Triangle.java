package homeworks;

public class Triangle extends Shape {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle(String name2, String color2, double a, double b, double c) {
    super(name2, color2);
    if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && c + b > a) {
      sideA = a;
      sideB = b;
      sideC = c;
    } else {
      throw new IllegalArgumentException("side size are not valid try again"); // Will make util
                                                                               // class to validate
                                                                               // input later
    }
  }

  public Triangle() {

  }

  @Override
  public double getPerimeter() {

    return sideA + sideB + sideC;
  }

  @Override
  public double getSquere() {
    double p = getPerimeter() / 2;
    return Math.sqrt((p) * (p - sideA) * (p - sideB) * (p - sideB));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(sideA);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(sideB);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(sideC);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Triangle other = (Triangle) obj;
    if (Double.doubleToLongBits(sideA) != Double.doubleToLongBits(other.sideA)) {
      return false;
    }
    if (Double.doubleToLongBits(sideB) != Double.doubleToLongBits(other.sideB)) {
      return false;
    }
    if (Double.doubleToLongBits(sideC) != Double.doubleToLongBits(other.sideC)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("Triangle [sideA = %s, sideB = %s, sideC = %s, ]", sideA, sideB, sideC);
  }



}
