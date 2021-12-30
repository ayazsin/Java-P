package tableau;

import java.util.Iterator;
import java.util.Scanner;

public class Tableau {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a name :..");
		
		String firstname = scanner.next().toLowerCase();
		
		String tableauDeFirstname [] = firstname.split("");
		
		String answr = "";
		
		do {
			
			System.out.println("Which character are you looking for:..");
			String chr = scanner.next().substring(0,1).toLowerCase();
			boolean isThereChr = false;
			
			for(String elt : tableauDeFirstname) {
				if (elt.equals(chr)) {
					isThereChr = true;
					break;
				}
			}
			
			if (isThereChr == true ) {
				System.out.println("There is " + chr + " in the firstname");
			} else {
				System.out.println("There is no " + chr + " in the firstname");
				
			}
			
			System.out.println("Do you wanna continue y/n..");
			answr = scanner.next().substring(0,1).toLowerCase();
			
		} while (answr.equals("y"));
		
		scanner.close();
		
	}

}
