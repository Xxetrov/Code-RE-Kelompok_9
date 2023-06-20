package Wide_Hierarchy.Types;

import Wide_Hierarchy.Entity;

import java.util.ArrayList;

public class Type extends Entity {
    private ArrayList<String> weakness;
    private ArrayList<String> effectives;

    public Type(String name, String sprite, ArrayList<String> weakness,
                ArrayList<String> effectives) {
        super(name, sprite);
        this.effectives = effectives;
        this.weakness = weakness;
    }

    public boolean isWeakAgainst(String typeName){
        //...
        return false;
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

