public class Display {

    public static void displayEmployees(Employee employee){
        System.out.println("Employee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Salary increase total: " + employee.getSalaryIncrease());
    
    }

    
}
