package Exercrsie;

public class LoopChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a= 'a';
		while (a <= 'z') {
			System.out.print(a + " , ");
			a++;
			
			
		}
		

		
		
		for( char c= 'a'; c<='z'; c++) {
			System.out.print(c + " ,  ");
			
		}
		for (int b1 = 1, b2 = 10 , b3 = 100; b1<=3 || b2<80; b1++ ,b2+=10, b3+=100) {
			System.out.println(b1 + " , " + b2 + " ,  " + b3);
		}
	}

}
