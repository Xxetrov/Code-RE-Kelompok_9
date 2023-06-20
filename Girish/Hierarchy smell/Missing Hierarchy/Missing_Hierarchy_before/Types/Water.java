package Missing_Hierarchy.Types;

import Missing_Hierarchy.Entity;

import java.util.ArrayList;

public class Water extends Entity {
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Water() {
        super("water", "");
        this.effectives = MakeEffectives();
        this.weakness = MakeWeaknesses();
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

    public ArrayList<String> getWeakness() {
        return weakness;
    }

    public void setWeakness(ArrayList<String> weakness) {
        this.weakness = weakness;
    }

    public ArrayList<String> getEffectives() {
        return effectives;
    }

    public void setEffectives(ArrayList<String> effectives) {
        this.effectives = effectives;
    }
}
