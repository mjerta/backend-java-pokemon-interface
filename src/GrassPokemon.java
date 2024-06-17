import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade"));
  private final String type = "grass";

  public GrassPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void leafStorm(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 30, 40, 60, 50);
    super.executeAttack(name, enemy, "leafStorm", damage);
  }

  public void solarBeam(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 30, 40, 60, 50);
    super.executeAttack(name, enemy, "solarBeam", damage);
  }

  public void leechSeed(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 40, 50, 70, 60);
    super.executeAttack(name, enemy, "leechSeed", damage);
  }

  public void leaveBlade(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 40, 50, 70, 60);
    super.executeAttack(name, enemy, "leaveBlade", damage);
  }
}
