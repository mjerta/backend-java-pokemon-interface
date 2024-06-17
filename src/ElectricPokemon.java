import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
  private final List<String> attacks = new ArrayList<>(Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle", "feed"));
  private final String type = "electric";

  public ElectricPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType(type);
  }

  public List<String> getAttacks() {
    return attacks;
  }

  public void thunderPunch(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 50, 60, 30, 40);
    super.executeAttack(name, enemy, "thunderPunch", damage);
  }

  public void electroBall(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 50, 60, 30, 40);
    super.executeAttack(name, enemy, "electroBall", damage);
  }

  public void thunder(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 60, 70, 40, 50);
    if (enemy.getType().equals("electric")) {
      int boostAmount = 30;
      enemy.boostHp(boostAmount);
      System.out.println("Oopsie , " + enemy.getName() + "is getting a boost of " + boostAmount + ".");
    }
    super.executeAttack(name, enemy, "thunder", damage);
  }

  public void voltTackle(Pokemon name, Pokemon enemy) {
    int damage = super.setDamage(enemy, 60, 70, 40, 50);
    super.executeAttack(name, enemy, "thunder", damage);
  }
}
