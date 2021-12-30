package address;


public class AddressController {
	
	public static void main(String[] args) {
		
		
		Person [] pop = {
				new Person ("Gilles","Dupont", 32, 
						new Address (2, "Rue Canebière", 
								13000, "Marseille")),
				new Person ("Valérie","Duparc", 20, 
						new Address (2, "Rue Pyrénées", 
								31800, "St-Gaudens")),
				new Person ("Virginie","Dulac", 30, 
						new Address (2, "Rue de la Paix", 
								75000, "Paris")),
				new Person ("Christine","Dubois", 40, 
						new Address (2, "Rue du Perdiguère", 
								38000, "Grenoble")),
				new Person ("Jean","Dubois", 40, 
						new Address (2, "Rue Pargaminières", 
								31200, "Toulouse")),
				new Person ("Marc","Dumas", 40, 
						new Address (2, "Rue des Pyrénées", 
								05700, "Briançon")),
		};
		
		
		for(Person elt : pop) {
			System.out.println(elt);
			
		}
		
		
		System.out.println("]\nAll : " +Person.getCompte() + "\nHaute Garonne : " + Person.getHgcompte());
		
		
		
		
		
		
	}

}
