package travel;

public interface KansaiAirport {

	public boolean CHECK_IN = false;
	
	// 추상클래스 : 항공사별로 각자의 체크인 서비스 제공
	void kansaiCheckIn(boolean check);
	// 추상클래스 : 항공사별로 각자의 라운지 서비스 제공
	void kansaiSecurityService(boolean check);
	
	// 정적메서드 : 식당가는 변경 불가능하다. 정해주는 것으로 무조건 사용
	static void kansaiRestaurantService() {
		System.out.println("간사이공항 식당가 이용.");
	}
	
	// default 메서드 : 고객 수하물 보관 서비스(필수 구현은 선택 사항)
	default String kansaiLuggageService(String luggage) {
		System.out.println("** 간사이공항에서 제공하는 수하물 보관 서비스 **");
		return "수하물 보관 서비스";
	}
	
}
