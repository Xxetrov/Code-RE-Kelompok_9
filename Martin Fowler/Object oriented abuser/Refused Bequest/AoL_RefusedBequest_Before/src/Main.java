
public class Main {

	public static void main(String[] args) {
		Company abc = new Company(5000000000.0, 2500000000.0);
		double tax = abc.calculateTax(abc.getIncome(), 0.3);
		
		System.out.println(tax);
	}

}
