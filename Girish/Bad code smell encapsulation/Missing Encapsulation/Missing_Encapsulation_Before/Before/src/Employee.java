
public class Employee {

    public String name;
    public String gender;
    public int age;
    public double salary;
    
    public double salaryIncrease (double amount){
        if(this.salary > 0){
            this.salary += amount*0.8;
        }else if(this.salary > 500){
            this.salary += amount*0.6;
        }else{
            this.salary += amount*0.4;
        }
        return salary;
    }
   
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.gender);
        System.out.println("Salary: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
   
    
}
