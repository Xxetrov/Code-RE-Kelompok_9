package Missing_Hierarchy.Pokemons;

import Missing_Hierarchy.Entity;
import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Fire;
import Missing_Hierarchy.Types.Grass;
import Missing_Hierarchy.Types.Water;

import java.util.ArrayList;
import java.util.Random;

public class Charmander extends Entity {
    private int health;
    private Entity type;
    private int speed;
    private ArrayList<Move> moveSet;

    public Charmander(String name) {
        super(name, "");
        this.health = 39;
        this.type = new Fire();
        this.speed = 65;
        this.moveSet = MakeMoveSet();
    }

    public void Attack(Entity target, Move move){
        if(target instanceof Mudkip){
            Water mudkipType = new Water();
            int damageMultiplier = 2;
            if(mudkipType.getWeakness().contains(move.getTypeName())){
                damageMultiplier = 3;
                System.out.println(getName() + " used " + move.getName()
                        + " its super effectibe");
            }
            else if(mudkipType.getEffectives().contains(move.getTypeName())){
                damageMultiplier = 1;
                System.out.println(getName() + " used " + move.getName()
                        + " its not effectibe");
            }
            ((Mudkip) target).setHealth(
                    ((Mudkip) target).getHealth() - move.getDamage()*damageMultiplier);
        }
        else if(target instanceof Charmander){
            Fire charmanderType = new Fire();
            int damageMultiplier = 2;
            if(charmanderType.getWeakness().contains(move.getTypeName())){
                damageMultiplier = 3;
                System.out.println(getName() + " used " + move.getName()
                        + " its super effectibe");
            }
            else if(charmanderType.getEffectives().contains(move.getTypeName())){
                damageMultiplier = 1;
                System.out.println(getName() + " used " + move.getName()
                        + " its not effectibe");
            }
            ((Charmander) target).setHealth(
                    ((Charmander) target).getHealth() - move.getDamage()*damageMultiplier);
        }
        else if(target instanceof Treecko){
            Grass treeckoType = new Grass();
            int damageMultiplier = 2;
            if(treeckoType.getWeakness().contains(move.getTypeName())){
                damageMultiplier = 3;
                System.out.println(getName() + " used " + move.getName()
                        + " its super effectibe");
            }
            else if(treeckoType.getEffectives().contains(move.getTypeName())){
                damageMultiplier = 1;
                System.out.println(getName() + " used " + move.getName()
                        + " its not effectibe");
            }
            ((Treecko) target).setHealth(
                    ((Treecko) target).getHealth() - move.getDamage()*damageMultiplier);
        }
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
        learnableMoves.add(new Move("Ember", 40, 100,
                "fire"));
        return learnableMoves;
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

    public Entity getType() {
        return type;
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
