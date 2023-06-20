package Wide_Hierarchy.Pokemons;

import Wide_Hierarchy.Move;
import Wide_Hierarchy.Types.Grass;

import java.util.ArrayList;
import java.util.Random;

public class Treecko extends Pokemon {
    public Treecko(String name) {
        super(name, Sprite(), 40, new Grass(), 70, MakeMoveSet());
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
        learnableMoves.add(new Move("Absorb", 20, 100,
                "grass"));
        return learnableMoves;
    }
}
