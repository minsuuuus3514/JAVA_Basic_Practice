package arrays_example;

public class IntArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		a.clone();
	}

}
