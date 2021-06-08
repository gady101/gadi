package a.array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mone = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of your sit :");
		int  x = sc.nextInt();
		int[][] matrix = new int[5][12];
		lbl: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				mone ++;
				if (x == mone) {
					switch(x) {
					case 1:
						System.out.println("the sit is not availble ");
						continue lbl;
					case 2:
						matrix[i][j]= 2;
						continue lbl;
					
				}
			
				
			}
			
		}
		}
		
		System.out.println(Arrays.toString(matrix));
		
		
		
		sc.close();

	}

}
