package arrays_example;

import java.util.Arrays;

public class ReverseArray {
	
	// 스왑 메서드
	public void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열의 요소를 역순으로 정렬
	public void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length-i-1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	// 배열의 요소들의 합
	public void sum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {45, 22, 11, 34, 25, 4};
//		System.out.println(arr);	// [I@2d363fb3
		System.out.println("** 배열 요소의 출력 **");
		System.out.println(Arrays.toString(arr));
		
		ReverseArray ra = new ReverseArray();
		System.out.println("** 배열 요소들의 역순 정렬 과정 **");
		ra.reverse(arr);
		System.out.println("** 배열 요소들의 합 **");
		ra.sum(arr);		
	}
}
