package calcul;

public class CalculP {

	private int nb1;
	private int nb2;
	private int sum;
	private int difference;
	private int multiply;
	private int divide;
	
	public CalculP(int nb1, int nb2) {
		this.nb1 = nb1;
		this.nb2 = nb2;
	}
	
	
	public int sum() {
		return this.nb1 + this.nb2;
	}
	public int difference() {
		return this.nb1 - this.nb2;
	}
	public int multiply() {
		return this.nb1 * this.nb2;
	}
	public int divide() {
		return this.nb1 / this.nb2;
	}
	@Override
	public String toString() {
		return "nb1=" + nb1 + ", nb2=" + nb2 + "\nsum=" + sum() + "\ndifference=" + difference()
				+ "\nmultiply=" + multiply() + "\ndivide=" + divide();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
