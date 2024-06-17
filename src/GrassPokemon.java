import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade"));
  private final String type = "grass";
  private int damage;

  public GrassPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void leafStorm(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafStorm");
  }

  public void solarBeam(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarBeam");
  }

  public void leechSeed(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechSeed");
  }

  public void leaveBlade(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade");
  }
}
