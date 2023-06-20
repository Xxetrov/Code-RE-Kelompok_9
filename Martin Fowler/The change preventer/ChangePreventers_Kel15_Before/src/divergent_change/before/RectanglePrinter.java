package divergent_change.before;

public abstract class RectanglePrinter {
	protected Rectangle r;
	
	public RectanglePrinter(Rectangle r) {
		super();
		this.r = r;
	}

	public abstract void print();
}
