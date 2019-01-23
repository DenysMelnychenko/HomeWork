package homeworks;

public class ItemGenerator {

  public Item createItem(String name, int generatorValue) {
    Item item = null;
    if (!name.equals(null)) {
      item = new Item(name, generate(generatorValue), generate(generatorValue),
          generate(generatorValue), generate(generatorValue * 10));
    }
    return item;
  }



  private static int generate(int range) {
    return (int) (Math.random() * range);
  }
}
