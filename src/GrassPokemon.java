import java.util.ArrayList;
import java.util.List;

public class GrassPokemon extends Pokemon {
  public GrassPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType("grass");
  }

  public List<String> getAttacks() {
    List<String> attacks = new ArrayList<>();
    attacks.add("leafStorm");
    attacks.add("solarBeam");
    attacks.add("leechSeed");
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
