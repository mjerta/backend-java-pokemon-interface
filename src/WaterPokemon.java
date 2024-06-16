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
    attacks.add("hydropump");
    attacks.add("hydrocanon");
    return attacks;
  }

  public void surf(Pokemon name, Pokemon enemy) {
  }
  public void hydroPump(Pokemon name, Pokemon enemy) {
  }
  public void hydroCanon(Pokemon name, Pokemon enemy) {
  }
  public void rainDance(Pokemon name, Pokemon enemy) {
  }
}
