package Wide_Hierarchy;


import Wide_Hierarchy.Pokemons.Mudkip;
import Wide_Hierarchy.Pokemons.Treecko;

public class App {
    public static void main(String[] args) {
        Test();
    }
    private static void Test(){
        Pokemon bob = new Mudkip("Bob");
        Pokemon geck = new Treecko("Geck");

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());

        bob.Attack(geck, bob.getMoveSet().get(0));

        System.out.println(bob.getName() + " " + bob.getHealth());
        System.out.println(geck.getName() + " " + geck.getHealth());
    }
}
