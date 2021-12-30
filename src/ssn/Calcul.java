package ssn;

public class Calcul {
	
	static long ssn(long nombre) {
		
		
		return nombre * 100 + (97 - (nombre%97)) ;
	}

}
