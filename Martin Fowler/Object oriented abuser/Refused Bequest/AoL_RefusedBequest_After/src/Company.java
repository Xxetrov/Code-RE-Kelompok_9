
public class Company{
	private double revenues;
	private double expenses;
	private PersonalTaxCalculator personalTaxCalc = new PersonalTaxCalculator();
	
	public Company(double revenues, double expenses) {
		this.revenues = revenues;
		this.expenses = expenses;
	}
	
	public double getIncome() {
		return revenues - expenses;
	}
	public double calculateTaxes(double income, double textRate) {
        return personalTaxCalc.calculateTax(income, textRate);
    }
	
}
