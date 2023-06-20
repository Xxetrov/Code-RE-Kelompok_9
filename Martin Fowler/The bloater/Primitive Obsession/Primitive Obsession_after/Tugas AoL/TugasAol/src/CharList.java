import java.util.ArrayList;

public class CharList {
	ArrayList<Character> charList = new ArrayList<>();
	ArrayList<Weapon> weapon = new ArrayList<>();
	ArrayList<Armor> armor = new ArrayList<>();
	
	
	public void addChar(Character newChar) {
		charList.add(newChar);
	}
	
	public void deleteChar(int idx) {
		charList.remove(idx);
	}
	
	public boolean isEmpty() {
		return charList.isEmpty();
	}
	
	public Integer getSize() {
		return charList.size();
	}
	
	public String getName(int idx) {
		return charList.get(idx).getName();
	}
	
	public String getCharClass(int idx) {
		return charList.get(idx).getCharClass();
	}
	
	public String getWeapon(int idx) {
		return charList.get(idx).weapon.getWeapon();
	}
	
	public String getWeaponType(int idx) {
		return charList.get(idx).weapon.getWeaponType();
	}
	
	public String getArmor(int idx) {
		return charList.get(idx).armor.getArmor();
	}
	
	public String getArmorType(int idx) {
		return charList.get(idx).armor.getArmorType();
	}
}
