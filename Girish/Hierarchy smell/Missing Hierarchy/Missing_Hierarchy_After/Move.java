package Missing_Hierarchy;

public class Move extends Entity{
    private int damage;
    private float accuracy;
    private String typeName;

    public Move(String name , int damage, int accuracy,
                String typeName) {
        super(name, "");
        this.damage = damage;
        this.accuracy = accuracy;
        this.typeName = typeName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
