package homeworks;

public class Square extends Shape {
  private double side;

  public Square(String name2, String color2, double side) {
    super(name2, color2);
    if (side >= 0) {
      this.side = side;
    }

  }

  public Square() {
    
  }

  @Override
  public double getPerimeter() {
    return side * 4;
  }

  @Override
  public double getSquere() {
    return side * side;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(side);
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
    Square other = (Square) obj;
    if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("Square [side = %s, color = %s, perimeter = %s, squere = %s]", side,
        getColor(), getPerimeter(), getSquere());
  }



}
