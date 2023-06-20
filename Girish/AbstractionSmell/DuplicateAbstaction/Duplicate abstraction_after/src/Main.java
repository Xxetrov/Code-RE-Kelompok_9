
public class Main {
	public static void main(String[] args) {
		mercedes Mercedes = new mercedes();
		ducati Ducati = new ducati();
		
		Mercedes.stock();
		Mercedes.model();
		Mercedes.color();
		System.out.println(" ");
		Ducati.stock();
		Ducati.model();
		Ducati.color();
		Ducati.cylinderCapacity();
	}
	
}
