package multifacetedAbstraction.after;

public class EmployeeTest {
    void test() {
        Employee employee = new Employee("John Doe", "123456");
        SalaryCalculator calculator = new SalaryCalculator(15.0, 40);
        double salary = calculator.calculateSalary();

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Salary: $" + salary);
    }
}
