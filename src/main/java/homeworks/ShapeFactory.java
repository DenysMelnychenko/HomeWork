package homeworks;

public class ShapeFactory {

  public Shape createShape(String shapeName) {
    switch (shapeName) {
      case ("Circle"):
        return new Circle();

      case ("Square"):
        return new Square();

      case ("Triangle"):
        return new Triangle();
      default:
        return null;

    }
  }
}
