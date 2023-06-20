package Wide_Hierarchy.Pokemons;

import Wide_Hierarchy.Move;
import Wide_Hierarchy.Pokemon;
import Wide_Hierarchy.Type;
import Wide_Hierarchy.Types.Fire;

import java.util.ArrayList;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name, String sprite, int health, int speed, ArrayList<Move> moveSet) {
        super(name, sprite, health, new Fire(), speed, moveSet);
    }

}
