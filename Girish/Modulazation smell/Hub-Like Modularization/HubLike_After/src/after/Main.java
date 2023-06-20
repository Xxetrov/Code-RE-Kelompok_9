package after;

public class Main {
	public static void main(String[] args) {
        ConcreteComponent component1 = new ConcreteComponent("Component 1");
        ConcreteComponent component2 = new ConcreteComponent("Component 2");

        component1.send("Hello!");
        component2.send("Welcome!");
    }
}
