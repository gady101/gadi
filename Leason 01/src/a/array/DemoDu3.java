package a.array;

import java.util.Arrays;

public class DemoDu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[5];
		int[] arr2 = {2,3,5,8};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println(("=========="));
		int[][] arrdim = { { 1,1 ,1 },{2,2},{3,333,33,3333,3}};
		
		
		for (int i = 0; i < arrdim.length; i++) {
			System.out.println(Arrays.toString(arrdim[i]));
			
			
			
			System.out.println(("=========="));
			System.out.println(Arrays.deepToString(arrdim));
			
		}

	}

}
