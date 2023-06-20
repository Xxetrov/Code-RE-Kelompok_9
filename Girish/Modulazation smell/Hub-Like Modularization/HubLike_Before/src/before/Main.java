package before;

public class Main {
	public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Component component1 = new ConcreteComponent("Component 1", mediator);
        Component component2 = new ConcreteComponent("Component 2", mediator);

        mediator.registerComponent(component1);
        mediator.registerComponent(component2);

        component1.send("Hello!");
        component2.send("Welcome!");
    }
}