
public class Character {
	private String name;
	private String charClass;
	Weapon weapon = new Weapon();
	Armor armor = new Armor();
	
	public Character(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.weapon.setWeapon(weapon);
		this.weapon.setWeaponType(weaponType);
		this.armor.setArmor(armor);
		this.armor.setArmorType(armorType);
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

	
	
	
}
