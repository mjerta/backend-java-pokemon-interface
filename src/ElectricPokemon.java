import java.util.ArrayList;
import java.util.List;

public class ElectricPokemon extends Pokemon {
  public ElectricPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("thunderpunch");
    attacks.add("electroball");
    attacks.add("thunder");
    return attacks;
  }

  public void thunderPunch(Pokemon name, Pokemon enemy) {
  }
  public void electroBall(Pokemon name, Pokemon enemy) {
  }
  public void thunder(Pokemon name, Pokemon enemy) {
  }
  public void voltTackle(Pokemon name, Pokemon enemy) {
  }
}
