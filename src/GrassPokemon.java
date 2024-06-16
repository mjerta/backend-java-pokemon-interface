import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
  public GrassPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("thunderpunch");
    attacks.add("electroball");
    attacks.add("thunder");
    return attacks;
  }
}
