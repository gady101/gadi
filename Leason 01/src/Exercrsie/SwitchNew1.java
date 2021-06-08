package Exercrsie;

import java.util.Scanner;

public class SwitchNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mode : [on , off , STAND_BY] ");
		String MaMode =  sc.nextLine();
		sc.close();
		System.out.println(MaMode);
		
		switch (MaMode) {
		case "on": 
			
			System.out.println("the machine is working");
			break;
		case "off": 
			
			System.out.println("the machine is not working");
			break;
		case "STAND_BY": 
			
			System.out.println("the machine is standby");
			break;
		
		default:
			System.out.println("the machine is standby");
			break;
		}
		
	}

}
