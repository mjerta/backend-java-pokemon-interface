import java.security.PrivateKey;

public class Pokemon {

  private String name;
  private int level;
  private int hp;
  private String pokemonFood;
  private String sound;

  public Pokemon(String name, int level, int hp, String pokemonFood, String sound) {
    this.name = name;
    this.level = level;
    this.hp = hp;
    this.pokemonFood = pokemonFood;
    this.sound = sound;
  }
}
