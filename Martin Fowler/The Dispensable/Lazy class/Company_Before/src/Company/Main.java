package Company;

public class Main {
	public static void main(String[] args) {
		workers jack = new workers("jack anderson",10000);
		workers keila = new workers("Keila rin", 11000);
		System.out.println(jack.getName() + "'s salary is Rp." + jack.getSalary());
		System.out.println(keila.getName() + "'s salary is Rp." + keila.getSalary());
	}
}
