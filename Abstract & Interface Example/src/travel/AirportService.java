package travel;

import travel.IncheonAirport;
import travel.KansaiAirport;
import travel.WonjuAirport;

public class AirportService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 대한항공
		IncheonAirport ICN = new KoreanAir();
		KansaiAirport KIX = new KoreanAir();
		
		System.out.println("\n*************대한항공*************\n");
		ICN.incheonCheckIn(true);
		ICN.robotInfo(null);
		ICN.incheonLuggageService("luggage NO.133");
		ICN.incheonSecurityService(false);
//		ICN.incheonRestaurantService();				// 식당가 이용 서비스는 아래의 형태로만 이용가능하다.
		IncheonAirport.incheonRestaurantService();
		KIX.kansaiCheckIn(true);
		KIX.kansaiLuggageService("luggage NO.133");
		KIX.kansaiSecurityService(true);
		KansaiAirport.kansaiRestaurantService();
		
		System.out.println("\n*************일본항공으로 변경*************\n");
		// 일본항공
		ICN = new JapanAirLines();
		KIX = new JapanAirLines();
		
		ICN.incheonCheckIn(false);
		ICN.incheonSecurityService(false);
		KIX.kansaiCheckIn(true);
		KIX.kansaiLuggageService("luggage NO.133");
		KIX.kansaiSecurityService(true);
		KansaiAirport.kansaiRestaurantService();
		
		System.out.println("\n*************고려항공은 인천공항과 간사이공항을 이용할 수 없음*************\n");
		// 서비스 호환 불가능
		
		/*
		ICN = new AirKoryo();
		KIX = new AirKoryo();
		
		ICN.incheonCheckIn(true);
		ICN.robotInfo(null);
		ICN.incheonLuggageService("luggage NO.133");
		ICN.incheonSecurityService(false);
		IncheonAirport.incheonRestaurantService();
		KIX.kansaiCheckIn(true);
		KIX.kansaiLuggageService("luggage NO.133");
		KIX.kansaiSecurityService(true);
		KansaiAirport.kansaiRestaurantService();
		*/
		
		System.out.println("\n*************전투비행단*************\n");
		WonjuAirport WJU = new CombatFlyingCorps();
		WJU.wonjuCheckIn(false);
		WJU.wonjuSecurityService(true);
		WJU.wonjuluggageService(null);		// CombatFlyingCorps 클래스에 지정하지 않았지만
											// 메인 클래스에서 재정의할 수 있음.
	}

}
