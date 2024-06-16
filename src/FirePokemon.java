public class FirePokemon extends Pokemon {

  public FirePokemon(String name, int level, int hp, String pokemonFood, String sound) {
    super(name, level, hp, pokemonFood, sound);
    super.setType("fire");
  }

  public String getAttacks() {
    return "1. inferno 2. electroball 3. thunder";
  }

  public void inferno(Pokemon name, Pokemon enemy) {

  }
}
