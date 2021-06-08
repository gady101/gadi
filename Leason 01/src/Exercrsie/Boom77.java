package Exercrsie;

import java.util.Scanner;

public class Boom77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		int top = sc.nextInt();
		sc.close();
		
		lbl:for (int i = 1; i <= top; i++) {
			if(i%7 == 0) {
				System.out.println("Boom");
				continue;
			}
			int x = i;
			while(x !=0) {
				if(x%10 ==7) {
					System.out.println("Boom");
					continue lbl;
					
				}
				x=x/10;
				
			}
			System.out.println(i);
			
			
		}
	}

}
