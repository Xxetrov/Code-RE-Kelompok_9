package Company1;

public class Main {
	
	public static void main(String[] args) {
		workers jack = new workers("jack anderson",10000);
		workers keila = new workers("Keila rin", 11000);
		System.out.println(jack.getName() + "'s salary is Rp." + jack.getSalary()+ " and the tax is Rp." + jack.salaryTax());
		System.out.println(keila.getName() + "'s salary is Rp." + keila.getSalary()+ " and the tax is Rp." + keila.salaryTax());
		
	}
}
