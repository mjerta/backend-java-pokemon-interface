import java.util.ArrayList;
import java.util.List;

public class FirePokemon extends Pokemon {

  public FirePokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType("fire");
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("inferno");
    attacks.add("pyroBall");
    attacks.add("fireLash");
    return attacks;
  }

  public void inferno(Pokemon name, Pokemon enemy) {
    enemy.
  }

  public void pyroBall(Pokemon name, Pokemon enemy) {
  }

  public  void fireLash(Pokemon name, Pokemon enemy) {
  }

  public void flameThrower(Pokemon name, Pokemon enemy) {
  }
}
