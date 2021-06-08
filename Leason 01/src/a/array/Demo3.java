package a.array;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[25];
		int sum = 0;
		for (int i = 0; i< arr.length; i++){
			int r = (int)(Math.random()*100);
			arr[i]  = r;
			System.out.println(arr[i]);
			sum+= arr[i];
		}
		System.out.println("==========");
		System.out.println(sum);

	}

}
