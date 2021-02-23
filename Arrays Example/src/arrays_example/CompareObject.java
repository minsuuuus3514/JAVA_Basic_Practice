package arrays_example;

public class CompareObject {

	// 배열의 요소들의 합
		public Object sum(int[] a) {
			int sum = 0;
			for(int i = 0; i < a.length; i++) {
				sum += a[i];
			}
//			System.out.println(sum);
			return sum;
		}
	
	// 두 배열을 비교하는 메서드
	public static boolean compare(Object obj1, Object obj2) {
		
		if(obj1.hashCode() == obj2.hashCode()) {
			return false;		// false = defeat
		}
		for(int i = 0; i < obj1.hashCode(); i++) {
			if(obj1.hashCode() > obj2.hashCode()) {
				return true;	// true = win
			}
		}
		return false;			// defeat
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열의 요소값의 합은 전투력 수치
		int[] team_A = new int[] {150, 50, 130, 270};
		int[] team_B = new int[] {440, 20, 190, 80};
		int[] team_C = new int[] {50, 70, 130, 370};
		int[] team_D = new int[] {250, 190, 70, 130};
		
		CompareObject co = new CompareObject();
		Object obj1 = co.sum(team_A);
		Object obj2 = co.sum(team_B);
		Object obj3 = co.sum(team_C);
		Object obj4 = co.sum(team_D);
		
		System.out.println("*** 전투력 정보 ***");
		System.out.println("A의 전투력 : " + obj1);
		System.out.println("B의 전투력 : " + obj2);
		System.out.println("C의 전투력 : " + obj3);
		System.out.println("D의 전투력 : " + obj4);
		
		System.out.println();
		System.out.println("*** team_A의 게임 결과 ***");
		System.out.println("team_A vs team_B 결과 = " + (compare(obj1, obj2) ? "A 승리 " + (obj1.hashCode() + obj2.hashCode()) : "패배 " + obj2));
		System.out.println("team_A vs team_C 결과 = " + (compare(obj1, obj3) ? "A 승리 " + (obj1.hashCode() + obj3.hashCode()) : "패배 " + obj3));
		System.out.println("team_A vs team_D 결과 = " + (compare(obj1, obj4) ? "A 승리 " + (obj1.hashCode() + obj4.hashCode()) : "패배 " + obj4));
		System.out.println("*** team_B의 게임 결과 ***");
		System.out.println("team_B vs team_A 결과 = " + (compare(obj2, obj1) ? "B 승리 " + (obj2.hashCode() + obj1.hashCode()) : "패배 " + obj1));
		System.out.println("team_B vs team_C 결과 = " + (compare(obj2, obj3) ? "B 승리 " + (obj2.hashCode() + obj3.hashCode()) : "패배 " + obj3));
		System.out.println("team_B vs team_D 결과 = " + (compare(obj2, obj4) ? "B 승리 " + (obj2.hashCode() + obj4.hashCode()) : "패배 " + obj4));
		System.out.println("*** team_C의 게임 결과 ***");
		System.out.println("team_C vs team_A 결과 = " + (compare(obj3, obj1) ? "C 승리 " + (obj3.hashCode() + obj1.hashCode()) : "패배 " + obj1));
		System.out.println("team_C vs team_B 결과 = " + (compare(obj3, obj2) ? "C 승리 " + (obj3.hashCode() + obj2.hashCode()) : "패배 " + obj2));
		System.out.println("team_C vs team_D 결과 = " + (compare(obj3, obj4) ? "C 승리 " + (obj3.hashCode() + obj4.hashCode()) : "패배 " + obj4));
		System.out.println("*** team_B ***");
		System.out.println("team_D vs team_A 결과 = " + (compare(obj4, obj1) ? "D 승리 " + (obj4.hashCode() + obj1.hashCode()) : "패배 " + obj1));
		System.out.println("team_D vs team_B 결과 = " + (compare(obj4, obj2) ? "D 승리 " + (obj4.hashCode() + obj2.hashCode()) : "패배 " + obj2));
		System.out.println("team_D vs team_C 결과 = " + (compare(obj4, obj3) ? "D 승리 " + (obj4.hashCode() + obj3.hashCode()) : "패배 " + obj3));
	}

}
