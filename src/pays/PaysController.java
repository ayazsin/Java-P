package pays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PaysController {
	
	public static void main(String[] args) {

		
		Pays espagne = new Pays("Espagne", "Europe", 2000000, "madrid", "barcelona");
		Pays france = new Pays("France", "Europe", 5000000, "paris", "lyon");
		
		List <Pays> pays = new ArrayList<>();
		pays.add(espagne);
		pays.add(france);
		
		
		Iterator<Pays> iterator =  pays.iterator();
		while (iterator.hasNext()) {
			
			Pays pay = iterator.next();
			System.out.println(pay);
			
		}
		
		france.add("toulouse");
		france.remove("lyon");
		
		
		System.out.println(france);
		
		
	}

}
