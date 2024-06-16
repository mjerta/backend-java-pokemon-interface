public class ElectricPokemon extends Pokemon {
  public ElectricPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
  }

  public String getAttacks() {
    return "1. thunderPuch 2. electroBall 3. thunder";
  }
}
