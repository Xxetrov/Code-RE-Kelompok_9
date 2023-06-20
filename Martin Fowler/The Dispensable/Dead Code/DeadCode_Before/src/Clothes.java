package dead_code;

import java.util.*;

public class Clothes {
	protected String name;
	protected String size;
	protected int price;
	public Clothes(String name, String size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
}
