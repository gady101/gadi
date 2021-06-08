package Exercrsie;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int)(Math.random()*100);
		int b =(int)( Math.random()*100);
		int sum  = a+b;
		float f = 2 ; 
		double  c = sum/f;
		int s = a*b ; 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
		System.out.println(c);
		System.out.println("area of  a + b is "+ s);
		System.out.println("the remainder of " + a + " divining of 10   is " +  (a%10) );
		System.out.println("the remainder of " + b + " divining of 10   is " +  (b%10) );
		;
		
		
		
	}

}
