import java.util.Scanner;

public class Menu {
	CharList cl = new CharList();
	Scanner sc = new Scanner(System.in);
	
	public void showMenu() {
		int choice = 0;
		while(choice < 1 || choice > 4) {
			clearScreen();
			System.out.println("CHARACTER CUSTOMIZER");
			System.out.println("1. Save Character");
			System.out.println("2. View Character");
			System.out.println("3. Remove Character");
			System.out.println("4. Exit");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				saveChar();
				confirmationLog();
				choice = 0;
			}else if(choice == 2) {
				viewChar();
				confirmationLog();
				choice = 0;
			}else if(choice == 3) {
				removeChar();
				confirmationLog();
				choice = 0;
			}
			
		}
	}
	
	private void saveChar() {
		String name;
		String charClass;
		String weapon;
		String weaponType;
		String armor;
		String armorType;
		
		System.out.println("Welcome to the character customization");
		System.out.print("Enter name: ");
		name = sc.nextLine();
		clearScreen();

		charClass = insertCharClass();
		clearScreen();
		
		System.out.println("Enter your weapon name: ");
		weapon = sc.nextLine();
		
		weaponType = insertWeaponType();
		clearScreen();
		
		System.out.println("Enter your starter armor name:");
		armor = sc.nextLine();
		
		armorType = insertArmorType();
		clearScreen();
		
		insertChar(name, charClass, weapon, weaponType, armor, armorType);
		System.out.println("Character Created!");
	}
	
	private String insertCharClass() {
		String res = "";
		int choice = 0;
		
		while(choice < 1 || choice > 5) {
			System.out.println("Character class:");
			System.out.println("1. Knight");
			System.out.println("2. Archer");
			System.out.println("3. Assassin");
			System.out.println("4. Berserker");
			System.out.println("5. Healer");
			System.out.print(">> ");
			choice = sc.nextInt();
			sc.nextLine();			
		}
		
		if(choice == 1) {
			res = "Knight";
		}else if(choice == 2) {
			res = "Archer";
		}else if(choice == 3) {
			res = "Assassin";
		}else if(choice == 4) {
			res = "Berserker";
		}else if(choice == 5) {
			res = "Healer";
		}
	
		return res;
	}
	
	private String insertWeaponType() {
		String res = "";
		int choice = 0;
		
		while(choice < 1 || choice > 4) {
			System.out.println("Weapon type: ");
			System.out.println("1. Sword");
			System.out.println("2. Bow");
			System.out.println("3. Magic Book");
			System.out.println("4. Healing Staff");
			choice = sc.nextInt();
			sc.nextLine();
		}
		
		
		if(choice == 1) {
			res = "Sword";
		}else if(choice == 2) {
			res = "Bow";
		}else if(choice == 3) {
			res = "Magic Book";
		}else if(choice == 4) {
			res = "Healing Staff";
		}
		
		return res;
	}
	
	private String insertArmorType() {
		String res = "";
		int choice = 0;
		
		while(choice < 1 || choice > 4) {
			System.out.println("Armor Type:");
			System.out.println("1. Anti Physical");
			System.out.println("2. Anti Magic");
			System.out.println("3. Anti Heal");
			System.out.println("4. Damage Return");
			choice = sc.nextInt();
			sc.nextLine();			
		}
		
		if(choice == 1) {
			res = "Anti Physical";
		}else if(choice == 2) {
			res = "Anti Magic";
		}else if(choice == 3) {
			res = "Anti Heal";
		}else if(choice == 4) {
			res = "Damage Return";
		}
		
		return res;
	}
	
	private void viewChar() {
		if(cl.isEmpty()) {
			System.out.println("There is no character yet");
			
			return;
		}else {
			System.out.println("||  No  | Name \t\t| Class \t | Weapon \t\t | Weapon Type \t | Armor \t\t | Armor Type \t ||");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			int count = cl.getSize();
			for(int i = 0; i < count; i++) {
				System.out.printf("||  %-3d | %-13s | %-14s | %-21s | %-13s | %-21s | %-13s ||\n", i + 1, cl.getName(i), cl.getCharClass(i), cl.getWeapon(i), cl.getWeaponType(i), cl.getArmor(i), cl.getArmorType(i));
			}
		}
	}
	
	private void removeChar() {
		int idx = 0;
		
		viewChar();
		if(cl.isEmpty()) {
			return;
		}
		
		System.out.print("Index to remove: ");
		idx = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Are you sure want to remove %s? [y/n]: ", cl.getName(idx - 1));
		String choice = "";
		choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("y")) {
			cl.deleteChar(idx - 1);
			System.out.println("Character Removed!");
		}else if(choice.equalsIgnoreCase("n")){
			return;
		}
	}
	
	private void insertChar(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
		Character newChar = new Character(name, charClass, weapon, weaponType, armor, armorType);
		cl.addChar(newChar);
	}
	
	private void clearScreen() {
		for(int i = 0; i < 32; i++) {
			System.out.println();
		}
	}
	
	private void confirmationLog() {
		System.out.println("Press any key to continue...");
		sc.nextLine();
	}
}
