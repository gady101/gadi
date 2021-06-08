package aba;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((int)(Math.random()*11));
		
		int a = (int)(Math.random()*11);
		int b = (int)(Math.random()*11);

		System.out.println(a + " + " + b + " = " +(a+b));
		System.out.println(a + " - " + b + " = " +(a-b));
		System.out.println(a + " * " + b + " = " +(a*b));
		
		int c = 10, d = 11;
		//נוסחה איך לקבל מספר בין 2 מספרים
		int r = (int)(Math.random()*(c-d + 1)) + a;
		System.out.println(r);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter minimum");
		int f = sc.nextInt();
		System.out.println("enter maximum");
		int g = sc.nextInt();
		
		sc.close();
	
		System.out.println(f + " + " + g + " = " +(f+g));
	}

}
