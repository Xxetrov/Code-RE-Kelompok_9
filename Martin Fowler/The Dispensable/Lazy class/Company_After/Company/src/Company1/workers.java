package Company1;

public class workers {
	
	private String name;
	private double salary;
	
	public  workers(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public double salaryTax(){
		return salary*0.05;
	}
}
