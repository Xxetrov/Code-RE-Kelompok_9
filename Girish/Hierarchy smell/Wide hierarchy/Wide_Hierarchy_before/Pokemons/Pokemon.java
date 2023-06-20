package Wide_Hierarchy.Pokemons;


import Wide_Hierarchy.Entity;
import Wide_Hierarchy.Move;
import Wide_Hierarchy.Types.Type;

import java.util.ArrayList;

public class Pokemon extends Entity {
    private int health;
    private Type type;
    private int speed;
    private ArrayList<Move> moveSet;

    public Pokemon(String name, String sprite, int health, Type type, int speed,
                   ArrayList<Move> moveSet) {
        super(name, sprite);
        this.health = health;
        this.type = type;
        this.speed = speed;
        this.moveSet = moveSet;
    }

    public void Attack(Pokemon target, Move move){
        int damageMultiplier = 2;
        Type targetType = target.getType();
        if(targetType.getWeakness().contains(move.getTypeName())){
            damageMultiplier = 3;
            System.out.println(getName() + " used " + move.getName()
                    + " its super effectibe");
        }
        else if(targetType.getEffectives().contains(move.getTypeName())){
            damageMultiplier = 1;
            System.out.println(getName() + " used " + move.getName()
                    + " its not effectibe");
        }
        target.setHealth(target.getHealth() - move.getDamage()*damageMultiplier);
    }

    private Move getMove(int index){
        return this.moveSet.get(index);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(ArrayList<Move> moveSet) {
        this.moveSet = moveSet;
    }
}
