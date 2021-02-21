package arrays_example;

public class MaxArray {

	public static int maxArr(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxArray ma = new MaxArray();

		int arr[] = new int[] {45, 22, 11, 34, 25, 4};
		System.out.println(ma.maxArr(arr));
	}

}
