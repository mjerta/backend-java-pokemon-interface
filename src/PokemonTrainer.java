import java.util.List;

public class PokemonTrainer {
  private String name;
  private List<Pokemon> pokemonList;
  private List<Food> foodlist;

  public PokemonTrainer(String name, List<Pokemon> pokemons, List<Food> foods) {
    this.name = name;
    this.pokemonList = pokemons;
    this.foodlist = foods;
  }

  public String getName() {
    return name;
  }

  public List<Pokemon> getPokemons() {
    return pokemonList;
  }

  public List<Food> getFoods() {
    return foodlist;
  }
}
