package multifacetedAbstraction.after;

public class SalaryCalculator {
    private double hourlyRate;
    private int hoursWorked;

    public SalaryCalculator(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
