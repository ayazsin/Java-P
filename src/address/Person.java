package address;

public class Person {
	
	private String nom;
	private String prenom;
	private int age;
	private Address adress;
	static private int compte;
	static private int hgcompte;
	final static private int HAUTEGARONNE = 31;
	
	public Person(String nom, String prenom, int age, Address adress) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adress = adress;
		compte++;
		if (adress.getCodePostal()/1000 == HAUTEGARONNE ) {
			setHgcompte(getHgcompte()+1);
		}		
		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address getAdress() {
		return adress;
	}


	public void setAdress(Address adress) {
		this.adress = adress;
	}
	


	public static int getCompte() {
		return compte;
	}

	public static void setCompte(int compte) {
		Person.compte = compte;
	}

	public static int getHgcompte() {
		return hgcompte;
	}

	public static void setHgcompte(int hgcompte) {
		Person.hgcompte = hgcompte;
	}

	@Override
	public String toString() {
		return "Personne [nom:" + nom + ", prenom:" + prenom + ", age:" + age + ", "+ adress;
	}
	

}
