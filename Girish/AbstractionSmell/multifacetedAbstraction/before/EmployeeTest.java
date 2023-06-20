package multifacetedAbstraction.before;

public class EmployeeTest {
    void test() {
        Employee employee = new Employee("John Doe", "123456");
        employee.setHourlyRate(15.0);
        employee.setHoursWorked(40);

        double salary = employee.calculateSalary();

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Salary: $" + salary);
    }
}
