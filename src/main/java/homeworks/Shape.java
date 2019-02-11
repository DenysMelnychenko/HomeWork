package homeworks;

public abstract class Shape {

  private String color;
  private String name;
  private double perimeter;
  private double squere;

  public Shape() {

  }

  public Shape(String name, String color) {
    this.name = name;
    this.color = color;
  }

  abstract public double getPerimeter();

  abstract public double getSquere();

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(perimeter);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(squere);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Shape other = (Shape) obj;
    if (color == null) {
      if (other.color != null) {
        return false;
      }
    } else if (!color.equals(other.color)) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    if (Double.doubleToLongBits(perimeter) != Double.doubleToLongBits(other.perimeter)) {
      return false;
    }
    if (Double.doubleToLongBits(squere) != Double.doubleToLongBits(other.squere)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("Shape [color = %s, perimeter = %s, squere = %s]", color, perimeter,
        squere);
  }



}
