package Exercrsie;

public class Boom7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*10000);
		int b  = a;
		for(int i=1; i<=a;i++ ) {
			if(i%7==0) {
				System.out.println("Boom");
			} 
				
			
				while(a!=0) {
					if (a%10==7) {
						System.out.println("Boom");
						break;
				} 
					a = (int)(a/10);
			}
				System.out.println(i);
				a = b;
				
		}
		
		

	}
	

}
