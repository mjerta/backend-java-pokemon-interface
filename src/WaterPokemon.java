import java.util.ArrayList;
import java.util.List;

public class WaterPokemon extends Pokemon {
  public WaterPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("surf");
    attacks.add("hydropump");
    attacks.add("hydrocanon");
    return attacks;
  }
}
