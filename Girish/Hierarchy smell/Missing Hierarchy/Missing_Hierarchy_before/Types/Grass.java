package Missing_Hierarchy.Types;

import Missing_Hierarchy.Entity;

import java.util.ArrayList;

public class Grass extends Entity {
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Grass() {
        super("fire", "");
        this.effectives = MakeEffectives();
        this.weakness = MakeWeaknesses();
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
