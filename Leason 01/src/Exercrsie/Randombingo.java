package Exercrsie;

public class Randombingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= (int)(Math.random()*101);
		
		if (a>50) {
			
			System.out.println("bigger");
		}else if(a<50) {
			System.out.println("smaller");
			
		}else {
			System.out.println("Bingo");
			
			
		}
		System.out.println(a);
		
		
	}

}
