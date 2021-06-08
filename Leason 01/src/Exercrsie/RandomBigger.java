package Exercrsie;

public class RandomBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c ;
		System.out.println(a);
		System.out.println(b);
		if (a>b) {
			System.out.println(a+ "  (a) is bigger");
		}else if(b>a) {
			System.out.println(b+ "  (b) is bigger");	
			
		}else {
			System.out.println( "  b = a");	
			
		}

	}

}
