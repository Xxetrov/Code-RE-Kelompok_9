package paralell_inheritance_hierarchies.before;

public class Triangle extends Shape2D {
	
	@Override
	public float area() {
		return  (height*width)/2;
	}
}