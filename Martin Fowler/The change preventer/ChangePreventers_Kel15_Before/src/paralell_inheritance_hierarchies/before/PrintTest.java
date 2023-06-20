package paralell_inheritance_hierarchies.before;

import org.junit.jupiter.api.Test;

class PrintTest {

	@Test
	void test() {
		Rectangle r = new Rectangle();
		r.setHeight(5);
		r.setWidth(4);
		
		RectangleAreaCalculator rac = new RectangleAreaCalculator(r);
		
		System.out.println(rac.area());
		
		
	}

}
