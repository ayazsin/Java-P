package personne;

public class Main {

	public static void main(String[] args) {

		Personne p1, p2, p3;
		p1 = new Personne("George") ;
		p2 = new Personne("Martin"); 
		p3 = new Personne("Jean");
		//p2.nom = "Dupond";
		//System.out.println("Je m'appelle"+ p2.nom); // Refuse. al la compilation
		p2.afficher();
		// affiche « Je m'appelle MARTIN Je ne suis pas salarie.. »
		p2.integrerSociete("Java SARL"); //OK
		p2.afficher();
		// affiche « Je m'appelle MARTIN et je travaille chez Java SARL »
		System.out.println(p2.toString());
		
		Personne [] personnes = {new Personne("Julien")};
		
		for(Personne personne : personnes) {
			personne.integrerSociete("Orange");
			System.out.println(personne);
		}
		
		System.out.println(p1.getNom());
		p2.setNom("ayse");
		System.out.println(p2.getNom());
		

	}

}
