package Missing_Hierarchy.Types;

import Missing_Hierarchy.Entity;

import java.util.ArrayList;

public class Fire extends Entity {
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Fire() {
        super("fire", "");
        this.effectives = MakeEffectives();
        this.weakness = MakeWeaknesses();
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
