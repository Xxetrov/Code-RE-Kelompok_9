package Wide_Hierarchy.Types;

import Wide_Hierarchy.Type;

import java.util.ArrayList;

public class Fire extends Type {
    public Fire() {
        super("fire", MakeSprite(), MakeWeaknesses(), MakeEffectives());
    }

    private static String MakeSprite(){
        return "";
    }

    private static ArrayList<String> MakeWeaknesses(){
        ArrayList<String> fireWeakness = new ArrayList<>();
        fireWeakness.add("water");
        return fireWeakness;
    }
    private static ArrayList<String> MakeEffectives(){
        ArrayList<String> fireEffectives = new ArrayList<>();
        fireEffectives.add("grass");
        return fireEffectives;
    }
}
