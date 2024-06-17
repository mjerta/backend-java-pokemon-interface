import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance"));
  private final String type = "water";

  public WaterPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void surf(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
  }

  public void hydroPump(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroPump");
  }

  public void hydroCanon(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydroCanon");
  }

  public void rainDance(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with rainDance");
  }
}
