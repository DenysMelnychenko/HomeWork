package homeworks;

public class Circle extends Shape {

  private double diameter;

  public Circle() {

  }

  public Circle(String name, String color, double diameter) {
    super(name, color);
    this.diameter = diameter;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * diameter;
  }

  @Override
  public double getSquere() {
    return (Math.PI * Math.pow(getDiameter(), 2) / 4);
  }

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(diameter);
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
    Circle other = (Circle) obj;
    if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("Circle [diameter = %s, color = %s, perimeter = %s, squere = %s ]",
        diameter, getColor(), getPerimeter(), getSquere());
  }



}
