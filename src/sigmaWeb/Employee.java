package sigmaWeb;

public class Employee {

	private String nom;
	private String prenom;
	private int age;
	private String societe;
	private double salarieMensuel;
	private double salarieAnnuel;


	public Employee(String nom, String prenom, int age, String societe, double salarieMensuel) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.societe = societe;
		this.salarieMensuel = salarieMensuel;
		setSalarieAnnuel();
	}


	public void setSociete(String societe) {
		this.societe = societe;
	}
	
	
	public void setSalarieMensuel(double salarieMensuel) {
		this.salarieMensuel = salarieMensuel;
	}


	public double getSalarieAnnuel() {
		return salarieAnnuel;
	}


	public void setSalarieAnnuel() {
		if (this.societe.equals("peugot")) 
			this.salarieAnnuel = salarieMensuel * 13;
		else 
			this.salarieAnnuel = salarieMensuel * 12;

	}
	
	public void coopter () {
		this.setSociete("pegout");
		setSalarieAnnuel();
		
		salarieAnnuel = salarieAnnuel + 1000;
		
	}


	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", societe=" + societe
				+ ", salarieMensuel=" + salarieMensuel + ", salarieAnnuel=" + salarieAnnuel;
	}


	









}
