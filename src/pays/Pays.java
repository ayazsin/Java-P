package pays;
import java.util.ArrayList;
import java.util.List;

public class Pays {
	
	private String nom;
	private String continent;
	private long population;
	private List <String> villes = new ArrayList<>();
	

	
	public Pays(String nom, String continent, int population, String... villes) {
		this.nom = nom;
		this.continent = continent;
		this.population = population;
		for(String eltString : villes)
		add(eltString);
	}

	public void add(String ville) {
		if(!villes.contains(ville))
		villes.add(ville);
		else System.out.println("Il y a cette ville dans le list");
			
	}
	
	public void remove(String ville) {
		if (villes.contains(ville)) {
			villes.remove(ville);
		} else System.out.println("Il n'y a pas cette ville dans le list");
		
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", continent=" + continent + ", population=" + population + ", villes=" + villes
				+ "]";
	}
	
	
	
	
	
	
	

}
