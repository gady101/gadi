package Exercrsie;

public class LoopRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		int c;
		System.out.println(a);
		System.out.println(b);
		if(b<a) {
			c=b;
			b=a;
			a=c;
		}
		
		for( int i = a; i<=b ; i++) {
			System.out.println(i);
		}
		//System.out.println(a);

	}

}
