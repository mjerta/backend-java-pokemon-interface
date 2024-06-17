import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance", "feed"));
  private final String type = "water";

  public WaterPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void surf(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 40, 30, 50, 60);
    super.executeAttack(name, enemy, "surf", damage);
  }

  public void hydroPump(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 40, 30, 50, 60);
    super.executeAttack(name, enemy, "hydroPump", damage);
  }

  public void hydroCanon(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 50, 40, 60, 70);
    super.executeAttack(name, enemy, "hydroCanon", damage);
  }

  public void rainDance(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 50, 40, 60, 70);
    super.executeAttack(name, enemy, "rainDance", damage);
  }
}
