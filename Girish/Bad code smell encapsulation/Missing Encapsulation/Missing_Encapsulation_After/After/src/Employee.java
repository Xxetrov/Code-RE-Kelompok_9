public class Employee {

    private String name;
    private String gender;
    private int age;
    private double salary;
    private double amount;

    public Employee(String name, String gender, int age, double salary, double amount){
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.salary=salary;
        this.salary=salary;
        this.amount=amount;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalaryIncrease() {
        if(this.salary > 0){
            this.salary += amount*0.8;
        }else if(this.salary > 500){
            this.salary += amount*0.6;
        }else{
            this.salary += amount*0.4;
        }
        return salary;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
