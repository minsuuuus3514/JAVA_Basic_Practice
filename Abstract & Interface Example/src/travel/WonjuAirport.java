package travel;

public interface WonjuAirport {

	public boolean CHECK_IN = false;
	
	// 추상클래스 : 항공사별로 각자의 체크인 서비스 제공
	void wonjuCheckIn(boolean check);
	
	void wonjuSecurityService(boolean check);
	
	// 정적메서드 : 식당가는 변경 불가능하다. 정해주는 것으로 무조건 사용
	static void wonjuRestaurantService() {
		System.out.println("원주공항 식당가 이용 가능합니다.");
	}
	
	// default 메서드 : 고객 수하물 보관 서비스(필수 구현은 선택 사항)
	default String wonjuluggageService(String luggage) {
		System.out.println("** 원주공항에서 제공하는 수하물 보관 서비스 **");
		return "수하물 보관 서비스";
	}
}
