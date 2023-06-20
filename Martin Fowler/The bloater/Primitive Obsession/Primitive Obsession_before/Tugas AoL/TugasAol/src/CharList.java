import java.util.ArrayList;

public class CharList {
	ArrayList<Character> charList = new ArrayList<>();
	
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
		return charList.get(idx).getWeapon();
	}
	
	public String getWeaponType(int idx) {
		return charList.get(idx).getWeaponType();
	}
	
	public String getArmor(int idx) {
		return charList.get(idx).getArmor();
	}
	
	public String getArmorType(int idx) {
		return charList.get(idx).getArmorType();
	}
}
