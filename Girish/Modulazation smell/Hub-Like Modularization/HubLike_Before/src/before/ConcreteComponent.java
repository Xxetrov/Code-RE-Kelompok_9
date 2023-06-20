package before;

public class ConcreteComponent implements Component{
	private String name;
    private Mediator mediator;

    public ConcreteComponent(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.notifyComponents(name + " sent: " + message);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
