package before;
import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	private List<Component> components = new ArrayList<>();

    public void registerComponent(Component component) {
        components.add(component);
    }

    public void notifyComponents(String message) {
        for (Component component : components) {
            component.receive(message);
        }
    }
}
