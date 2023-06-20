public class Main {
    public static void main(String[] args) throws Exception {

        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.gender = "Male";
        employee1.age = 26;
        employee1.salary = 10000;
        employee1.salaryIncrease(100);
    
        employee1.display();
    }
}
