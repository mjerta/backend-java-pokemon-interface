import java.util.List;

public class PokemonGymOwner {

  String name;
  String town;
  List<Pokemon> pokemons;
  private List<Food> foodList;

  public PokemonGymOwner(String name, String town, List<Pokemon> pokemons, List<Food> foods) {
    this.name = name;
    this.town = town;
    this.pokemons = pokemons;
    this.foodList = foods;
  }

  public String getName() {
    return name;
  }

  public String getTown() {
    return town;
  }

  public List<Pokemon> getPokemons() {
    return pokemons;
  }

  public List<Food> getFoodList() {
    return foodList;
  }
}
