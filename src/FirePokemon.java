import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
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

    int damage = super.setDamage(enemy, 60, 50, 40, 30);

    System.out.println(enemy.getName() + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy.getName() + " now has an hp of " + enemy.getHp());
  }

  public void pyroBall(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroBall");

    int damage = super.setDamage(enemy, 60, 50, 40, 30);

    System.out.println(enemy.getName() + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy.getName() + " now has an hp of " + enemy.getHp());
  }

  public void fireLash(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with fireLash");

    int damage = super.setDamage(enemy, 70, 60, 50, 40);

    System.out.println(enemy.getName() + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy.getName() + " now has an hp of " + enemy.getHp());
  }

  public void flameThrower(Pokemon name, Pokemon enemy) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with flameThrower");

    int damage = super.setDamage(enemy, 70, 60, 50, 40);

    System.out.println(enemy.getName() + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy.getName() + " now has an hp of " + enemy.getHp());
  }

}
