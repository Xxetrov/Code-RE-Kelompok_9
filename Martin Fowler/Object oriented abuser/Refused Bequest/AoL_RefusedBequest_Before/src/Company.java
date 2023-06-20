
public class Company extends PersonalTaxCalculator{
	private double revenues;
	private double expenses;
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	
	
}
