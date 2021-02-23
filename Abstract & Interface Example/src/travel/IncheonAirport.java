package travel;

public interface IncheonAirport {
	
	public boolean CHECK_IN = false;
	
	// 추상클래스 : 항공사별로 각자의 체크인 서비스 제공
	void incheonCheckIn(boolean check);
	// 추상클래스 : 인천공항 보안 검색
	void incheonSecurityService(boolean check);
		
	// 정적메서드 : 식당가는 변경 불가능하다. 정해주는 것으로 무조건 사용
	static void incheonRestaurantService() {
		System.out.println("인천공항 식당가 이용");
	}
	
	// default 메서드 : 공항 안내 서비스(필수 구현은 선택 사항)
	default String robotInfo(String robot) {
		System.out.println("로봇 안내");
		return "로봇안내 서비스";	
	}
	
	// default 메서드 : 고객 수하물 보관 서비스(필수 구현은 선택 사항)
	default String incheonLuggageService(String luggage) {
		System.out.println("** 인천공항에서 제공하는 수하물 보관 서비스 **");
		return "수하물 보관 서비스";
	}
	
}
