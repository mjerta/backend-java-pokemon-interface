import java.util.List;
import java.util.Scanner;

public class Pokemon {

  private final String name;
  private int level;
  private int hp;
  private final String food;
  private final String sound;
  private String type;

  public Pokemon(String name, int level, int hp, String food, String sound) {
    this.name = name;
    this.level = level;
    this.hp = hp;
    this.food = food;
    this.sound = sound;
  }

  public void boostHp(int amount) {
    this.hp += amount;
  }

  public void feedPokemon(Pokemon pokemon, boolean isGymPokemon, List<Food> foods) {
    if (!isGymPokemon) {
      String allChoisesAvailable = "";

      for (Food food : foods) {
        allChoisesAvailable += food.getName() + " ";
      }
      System.out.println("What food do you want to give to your Pokémon?");
      System.out.println("You can choose between: " + allChoisesAvailable);
      Scanner scanner = new Scanner(System.in);
      String choice = scanner.nextLine();

      feed(pokemon, choice);
    }
    else {
      // For now the standard choise for the gym pokemon is just his default,so he vant make any mistakes.
      feed(pokemon, pokemon.food);
    }
  }

  private void feed(Pokemon pokemon, String choice) {
    if (pokemon.getFood().equals(choice) || "Everything".equals(pokemon.food)) {
      int boostAmount = 30;
      pokemon.boostHp(boostAmount);
      System.out.println("Feeding " + pokemon.getName() + " with " + pokemon.food);
      System.out.println("HP is boosted by " + boostAmount);
      System.out.println("The HP of " + pokemon.getName() + " is now " + pokemon.getHp());
    }
    else {
      System.out.println("This Pokémon does not eat that.");
    }
  }

  // this is a method all types of pokemon can acces. This make it easy to determine the damage for a particular type of pokemon.
  public int setDamage(Pokemon enemy, int grass, int water, int electric, int fire) {
    int damage;
    switch (enemy.getType()) {
      case "grass":
        damage = grass;
        break;
      case "water":
        damage = water;
        break;
      case "electric":
        damage = electric;
        break;
      default:
        damage = fire;
        break;
    }
    return damage;
  }

  // this is a method all types of pokemon can acces. This make it easy to determine the damage for a particular type of pokemon.
  public void executeAttack(Pokemon name, Pokemon enemy, String attackName, int damage) {
    System.out.println(name.getName() + " attacks " + enemy.getName() + " with " + attackName);
    System.out.println(enemy.getName() + " loses " + damage + " hp");
    enemy.setHp(enemy.getHp() - damage);
    System.out.println(enemy.getName() + " now has an hp of " + enemy.getHp());
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public String getFood() {
    return food;
  }

  public String getSound() {
    return sound;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

}
