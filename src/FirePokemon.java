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
    attacks.add("flameThrower");
    return attacks;
  }

  public void inferno(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
  }

  public void pyroBall(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");

  }

  public  void fireLash(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");

  }

  public void flameThrower(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");

  }
}
