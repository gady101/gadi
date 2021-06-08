package Exercrsie;

public class IfPractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int g =  (int)(Math.random()*101);
		System.out.println(g);
		if (g<56) {
			System.out.println( " Not good");
		}else if (70>g){
			System.out.println("Almost good");

		}else if (85>g) {
			System.out.println(" Good");
		}else if (95>g) {
			System.out.println(" Very Good");
			
		}else {
			System.out.println("Great");
		}
	}

}
