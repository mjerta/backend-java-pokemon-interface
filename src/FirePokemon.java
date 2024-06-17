import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
  // needs another variable
  private int damage;
  private final List<String> attacks = new ArrayList<>(Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower"));
  private final String type = "fire";

  public FirePokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void inferno(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
  }

  public void pyroBall(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");
    damage = 30;
    System.out.println(enemy + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy + " now has an hp of " + enemy.getHp());
  }

  public void fireLash(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");
  }

  public void flameThrower(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");
  }
}
