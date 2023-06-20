package Wide_Hierarchy.Pokemons;


import Wide_Hierarchy.Move;
import Wide_Hierarchy.Pokemon;
import Wide_Hierarchy.Types.Fire;

import java.util.ArrayList;
import java.util.Random;

public class Mudkip extends WaterPokemon {
    public Mudkip(String name) {
        super(name, Sprite(), 50,  40, MakeMoveSet());
    }
    private static String Sprite(){
        String charmanderSprite = "";
        return charmanderSprite;
    }

    public static ArrayList<Move> MakeMoveSet(){
        ArrayList<Move> learnableMoves = LearnableMoves();
        ArrayList<Move> newMoveSet = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(learnableMoves.size());
            Move move = learnableMoves.get(randomIndex);
            newMoveSet.add(move);
        }

        return newMoveSet;
    }

    public static ArrayList<Move> LearnableMoves(){
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Water Gun", 40, 100,
                "water"));
        return learnableMoves;
    }
}
