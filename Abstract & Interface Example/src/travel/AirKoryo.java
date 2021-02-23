package travel;

public class AirKoryo {

	public void pyeongyangCheckIn(boolean check) {
		System.out.println("[평양공항] 고려항공만의 체크인 서비스");
		if(check == true) {
			System.out.println("일반 체크인");
		} else {
			System.out.println("체크인 대기 중");
		}
	}
	
	public void pyeongyangSecurityService(boolean check) {
		System.out.println("[평양공항] 고려항공만의 보안검색");
		if(check == true) {
			System.out.println("보안검색 통과");
		} else {
			System.out.println("보안검색 대기 중");
		}
	}
	
	public void pyeongyangRestaurantService() {
		System.out.println("평양공항만의 식당가");
	}
}
