package fct;

public class FCT {

	public static void main(String[] args) {
		
		System.out.println(sum(3));
		System.out.println(sumRecursive(4));
		System.out.println(sum(10));
		System.out.println(dolarConvertirAEuro(10000));
		System.out.println(euroConvertirADolar(168.56));
			

	}
	
	public static int sum(int num) {
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int sumRecursive(int num) {	 
		return num == 1 ? 1 : num + sumRecursive(--num);
	}
	
	static String dolarConvertirAEuro(double num) {
		double sum = 0;
		sum = num * 1.12;	
 		return "$" + String.format("%.02f",num) + " est €" + String.format("%.02f",sum); 
	}
	
	static String euroConvertirADolar(double num) {
		double sum = 0;
		sum = num / 1.12;	
		
 		return "€" + String.format("%.02f",num) + " est $" + String.format("%.02f",sum); 
	}

}
