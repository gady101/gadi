package a.array;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] cinema = new char[3][5];
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				cinema[i][j] = '0';
				
			}
		}
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j]+ " ");
				
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row:  ");
		int row = sc.nextInt()- 1;
		System.out.println("enter seat:  ");
		int seat = sc.nextInt()- 1;
		
		cinema[row][seat] = 'x' ; 
		
		
		for (int i = 0; i < cinema.length; i++) {
			for (int j = 0; j < cinema[i].length; j++) {
				System.out.print(" " + cinema[i][j]+ " ");
				
			}
			System.out.println();
		
		}
		sc.close();
	}
		
	
	

}
