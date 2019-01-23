package homeworks;

public class HeroGenerantor {

  public Hero createHero(String name, String type, int generatorValue) {
    Hero hero = null;
    if (type != null) {
      switch (type) {
        case "mag":
          hero = new Mag(name, generate(generatorValue), generate(generatorValue),
              generate(generatorValue), generate(generatorValue * 10));
          break;
        case "sniper":
          hero = new Marksmen(name, generate(generatorValue), generate(generatorValue),
              generate(generatorValue), generate(generatorValue * 10));
          break;
        default:
          break;
      }
    }
    return hero;
  }

  private static int generate(int range) {
    return (int) (Math.random() * range);
  }
}
