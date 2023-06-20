package Wide_Hierarchy.Types;

import Wide_Hierarchy.Type;

import java.util.ArrayList;

public class Grass extends Type {
    public Grass() {
        super("grass", MakeSprite(), MakeWeaknesses(), MakeEffectives());
    }

    private static String MakeSprite(){
        return "";
    }

    private static ArrayList<String> MakeWeaknesses(){
        ArrayList<String> grassWeakness = new ArrayList<>();
        grassWeakness.add("fire");
        return grassWeakness;
    }
    private static ArrayList<String> MakeEffectives(){
        ArrayList<String> grassEffectives = new ArrayList<>();
        grassEffectives.add("water");
        return grassEffectives;
    }
}
