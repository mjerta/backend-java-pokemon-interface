public class GrassPokemon extends Pokemon {
  public GrassPokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
  }

  public String getAttacks() {
    return "1. leafStorm 2. solarBeam 3. leechSeed";
  }
}
