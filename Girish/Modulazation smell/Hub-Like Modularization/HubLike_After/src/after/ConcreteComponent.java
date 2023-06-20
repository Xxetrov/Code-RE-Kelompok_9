package after;

public class ConcreteComponent {
	private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " sent: " + message);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
