package divergent_change.before;


import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void test() {
		Rectangle r = new Rectangle(5, 3);
		assertEquals(r.area(), 15);
		assertEquals(r.perimeter(), 16);
		
		FullRectanglePrinter fullRectanglePrinter = new FullRectanglePrinter(r);
		fullRectanglePrinter.print();
		BorderRectanglePrinter brd = new BorderRectanglePrinter(r);
		brd.print();
		
		
		
	}

	private void assertEquals(int area, int i) {
		// TODO Auto-generated method stub
		
	}

}