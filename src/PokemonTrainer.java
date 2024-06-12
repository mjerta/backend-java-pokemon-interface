import java.util.List;

public class PokemonTrainer {
  private String user;
  private List<Pokemon> pokemonList;


  public PokemonTrainer(String user, List<Pokemon> pokemons) {
    this.user = user;
    this.pokemonList = pokemons;
  }

  public String getUser() {
    return user;
  }

  public List<Pokemon> getPokemons() {
    return pokemonList;
  }

}
