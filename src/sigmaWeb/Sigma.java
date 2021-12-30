package sigmaWeb;

public class Sigma {
	
	public static void main(String[] args) {
		
		Employee p1 = new Employee("Darc", "Jean", 35, "reno", 2000);
		Employee p2 = new Employee("Blanc", "Marc", 45, "peugot", 3000);
		
		p1.coopter();
		System.out.println(p1);
		System.out.println(p2);

		
		
	}

}
