
public class Weapon {
	public String name;
    private String type;

    public Weapon(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void weapontype(){
        System.out.println(type);
    }
}
