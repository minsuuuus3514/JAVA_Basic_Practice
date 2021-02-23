package travel;

import travel.IncheonAirport;
import travel.KansaiAirport;

public class KoreanAir implements IncheonAirport, KansaiAirport {

	@Override
	public void kansaiCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[간사이공항] 대한항공만의 체크인 서비스");
		if(check == true) {
			System.out.println("대한항공 일반 체크인");
			System.out.println("대한항공 스마트 체크인");
			System.out.println("대한항공 QR 체크인");
		} else {
			System.out.println("체크인 대기 중");
		}
	}
	
	@Override
	public void kansaiSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[간사이공항] 대한항공만의 보안 검색");
		if(check == true) {
			System.out.println("보안검색 통과");
		} else {
			System.out.println("보안검색 대기 중");
		}
	}
	
	@Override
	public void incheonCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[인천공항] 대한항공만의 체크인 서비스");
		if(check == true) {
			System.out.println("대한항공 일반 체크인");
			System.out.println("대한항공 스마트 체크인");
			System.out.println("대한항공 QR 체크인");
		} else {
			System.out.println("체크인 대기 중");
		}
	}

	@Override
	public void incheonSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[인천공항] 대한항공만의 보안 검색");
		if(check == true) {
			System.out.println("보안검색 통과");
		} else {
			System.out.println("보안검색 대기 중");
		}
	}
	
	// default 메서드 : 공항 안내 서비스(필수 구현은 선택 사항)
	public String robotInfo() {
		System.out.println("인천 공항 로봇 안내 서비스를 제공 중입니다.");
		return "로봇안내 서비스";	
	}
	
	// default 인천공항 수하물 보관 서비스 이용
	public String incheonLuggageService(String luggage) {
		System.out.println("** 인천공항에서 제공하는 수하물 보관 서비스 이용 중 **");
		return "수하물 보관 서비스";
	}
	
	// default 간사이공항 수하물 보관 서비스 이용
	public String kansaiLuggageService(String luggage) {
		System.out.println("** 간사이공항에서 제공하는 수하물 보관 서비스 이용 중 **");
		return "수하물 보관 서비스";
	}
	
	// static
	static void incheonRestaurantService() {
		System.out.println("인천공항 식당가 이용 가능합니다.");
	}
	
	static void kansaiRestaurantService() {
		System.out.println("간사이공항 식당가 이용 가능합니다.");
	}
}
