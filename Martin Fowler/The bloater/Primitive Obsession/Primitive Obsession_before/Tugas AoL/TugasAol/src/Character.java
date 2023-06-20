
public class Character {
	private String name;
	private String charClass;
	private String weapon;
	private String weaponType;
	private String armor;
	private String armorType;
	
	public Character(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.weapon = weapon;
		this.weaponType = weaponType;
		this.armor = armor;
		this.armorType = armorType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getArmorType() {
		return armorType;
	}

	public void setArmorType(String armorType) {
		this.armorType = armorType;
	}
	
	
}
