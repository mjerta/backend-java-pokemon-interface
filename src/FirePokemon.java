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
    int damage = super.setDamage(enemy, 60, 50, 40, 30);
    super.executeAttack(name, enemy, "inferno", damage);
  }

  public void pyroBall(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 60, 50, 40, 30);
    super.executeAttack(name, enemy, "pyroBall", damage);
  }

  public void fireLash(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 70, 60, 50, 40);
    super.executeAttack(name, enemy, "fireLash", damage);
  }

  public void flameThrower(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 70, 60, 50, 40);
    super.executeAttack(name, enemy, "flameThrower", damage);
  }
}
