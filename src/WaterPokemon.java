import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
  public WaterPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType("water");
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("surf");
    attacks.add("hydroPump");
    attacks.add("hydroCanon");
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
