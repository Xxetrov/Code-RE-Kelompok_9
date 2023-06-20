
public class Main {

	public static void main(String[] args) {
		Company abc = new Company(50000.0, 250.0);
		double tax = abc.calculateTaxes(abc.getIncome(), 0.3);
		
		System.out.println(tax);
	}

}