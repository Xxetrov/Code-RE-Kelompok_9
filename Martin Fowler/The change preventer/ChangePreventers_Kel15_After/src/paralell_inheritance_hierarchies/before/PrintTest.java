package paralell_inheritance_hierarchies.before;

import org.junit.jupiter.api.Test;

class PrintTest {

	@Test
	void test() {
		Rectangle r = new Rectangle();
		r.setHeight(5);
		r.setWidth(4);
		
		System.out.println(r.area());
		
		Triangle triangle = new Triangle();
		triangle.setHeight(10);
		triangle.setWidth(25);
		
		System.out.println(triangle.area());
		
		
		
		
	}

}
