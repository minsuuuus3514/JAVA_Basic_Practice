package arrays_example;

public class IntArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];
		
		a[1] = 13;
		a[2] = 24;
		a[3] = a[1] * 7;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
