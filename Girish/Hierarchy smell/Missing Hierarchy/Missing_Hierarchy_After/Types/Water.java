package Missing_Hierarchy.Types;

import java.util.ArrayList;

public class Water extends Type {

    public Water() {
        super("water", MakeSprite(), MakeWeaknesses(),
                MakeEffectives());
    }

    private static String MakeSprite(){
        return "";
    }

    private static ArrayList<String> MakeWeaknesses(){
        ArrayList<String> waterWeakness = new ArrayList<>();
        waterWeakness.add("grass");
        return waterWeakness;
    }
    private static ArrayList<String> MakeEffectives(){
        ArrayList<String> waterEffectives = new ArrayList<>();
        waterEffectives.add("fire");
        return waterEffectives;
    }
}
