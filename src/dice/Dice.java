package dice;

import java.util.Random;

import fct.FCT;

public class Dice {

	public static void main(String[] args) {
		
		System.out.println(calculDice(1,6));
		System.out.println();
		
	}
	
	static int rollDice(int d) {
		Random random = new Random();
		int num = random.nextInt(6 * d) + 1;
		return num;
		
	}
	
	/**
	 * 
	 * @param int: nb des
	 * @param int: nb d'experiences
	 * @param int: nb cherche
	 * @author ayse
	 */
	
	static double calculDice(int d, int exp) {		
		int nb = 0;	
		for(int i = 0; i <= 100000; i++) {
			if (rollDice(d) == exp) {
				nb++;		
			}
		}
		return nb * 0.001;	
	}
	


}
