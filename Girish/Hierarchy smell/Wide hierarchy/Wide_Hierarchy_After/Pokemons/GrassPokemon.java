package Wide_Hierarchy.Pokemons;

import Wide_Hierarchy.Move;
import Wide_Hierarchy.Pokemon;
import Wide_Hierarchy.Type;
import Wide_Hierarchy.Types.Grass;

import java.util.ArrayList;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, String sprite, int health, int speed, ArrayList<Move> moveSet) {
        super(name, sprite, health, new Grass(), speed, moveSet);
    }
}
