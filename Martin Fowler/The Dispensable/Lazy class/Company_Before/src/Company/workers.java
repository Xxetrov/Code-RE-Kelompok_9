package Company;

public class workers {
	//Code smell
	private String name;
	private int salary;
	
	public workers(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
}
