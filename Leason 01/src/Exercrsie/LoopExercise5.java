package Exercrsie;

public class LoopExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100000);
		System.out.println(a);
		int b = a;
		int mone=1;
		
				while(a>9) {
					a= (int)(a/10);
					mone++;
					
				}
		
		System.out.println(mone);

	}

}
