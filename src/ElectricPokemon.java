import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle"));
  private final String type = "electric";

  public ElectricPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void thunderPunch(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderPunch");
  }

  public void electroBall(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroBall");
  }

  public void thunder(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
  }

  public void voltTackle(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with voltTackle");
  }
}
