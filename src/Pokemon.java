import java.security.PrivateKey;

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
