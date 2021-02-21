package arrays_example;

public class CompareArray {

	// 두 배열을 비교하는 메서드
	public static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {	
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {5, 7, 13, 27, 19};
		int[] b = new int[] {44, 21, 19, 27, 4};
		int[] c = new int[] {5, 7, 13, 27, 19};
		int[] d = new int[] {5, 19, 7, 13, 27};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println();
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		System.out.println();
		
		for(int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		System.out.println();
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같다." : "다르다."));
		System.out.println("배열 a와 c는 " + (equals(a, c) ? "같다." : "다르다."));
		System.out.println("배열 a와 d는 " + (equals(a, d) ? "같다." : "다르다."));
	}

}
