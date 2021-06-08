package a.array;

import java.util.Arrays;

public class DemoDuCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2 ,4 ,6 ,7, 10,32,54,65,7,23,65,9,213,86,32,46,23,46,23,65,2,546,76,34,5};
		int[] arr2 = new int[arr1.length];
		int mone = 0;
		for (int i = 0; i <= arr1.length; i+=3) {
			
			System.arraycopy(arr1, i, arr2, mone, 1);
			mone++;
		}
		
		
		//System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
