package personne;

public class Personne { 
	//----------------------------------------- 
	// Les caractéristiques physiques 
	//----------------------------------------- 
	private String nom ;
	private String societe ;

	//---------------------------------------------------- 
	// Les caractéristiques comportementales 
	//----------------------------------------------------

	// 1- Construit un objet Personne de société inconnue et de nom correspondant // au paramètre nom
	public Personne (String nom) {
		this.nom = nom.toUpperCase();
		this.societe = "?"; 
		// Par convention, la chaîne de caractères ? stipule que la
		// personne n’est pas employée
	}

	public void integrerSociete (String entreprise) {
		societe = entreprise ; }
	// 2 - Affiche les caractéristiques de la personne

	public void afficher() { System.out.print("Je m’appelle " + nom) ;
	if (societe.equals("?"))
		System.out.println(" et je ne suis pas salarie.. ");
	else
		System.out.println(" et je travaille chez : " + societe);
	}
	
	

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", societe=" + societe + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	// class Personne
	
	

}
