import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade", "feed"));
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
    int amountToLeech = 40;
    int currentHpEnemy = enemy.getHp();
    int currentHpPlayer = name.getHp();
    name.setHp(currentHpPlayer + amountToLeech);
    enemy.setHp(currentHpEnemy - amountToLeech);
    System.out.println("The hp is leeched from the enemy with " + amountToLeech);
    System.out.println("The current of the " + enemy.getName() + " is " + enemy.getHp());
    System.out.println("The current of the " + name.getName() + " is " + name.getHp());
  }

  public void leaveBlade(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 40, 50, 70, 60);
    super.executeAttack(name, enemy, "leaveBlade", damage);
  }
}
