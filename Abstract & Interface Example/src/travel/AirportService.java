package travel;

import travel.IncheonAirport;
import travel.KansaiAirport;
import travel.WonjuAirport;

public class AirportService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �����װ�
		IncheonAirport ICN = new KoreanAir();
		KansaiAirport KIX = new KoreanAir();
		
		System.out.println("\n*************�����װ�*************\n");
		ICN.incheonCheckIn(true);
		ICN.robotInfo(null);
		ICN.incheonLuggageService("luggage NO.133");
		ICN.incheonSecurityService(false);
//		ICN.incheonRestaurantService();				// �Ĵ簡 �̿� ���񽺴� �Ʒ��� ���·θ� �̿밡���ϴ�.
		IncheonAirport.incheonRestaurantService();
		KIX.kansaiCheckIn(true);
		KIX.kansaiLuggageService("luggage NO.133");
		KIX.kansaiSecurityService(true);
		KansaiAirport.kansaiRestaurantService();
		
		System.out.println("\n*************�Ϻ��װ����� ����*************\n");
		// �Ϻ��װ�
		ICN = new JapanAirLines();
		KIX = new JapanAirLines();
		
		ICN.incheonCheckIn(false);
		ICN.incheonSecurityService(false);
		KIX.kansaiCheckIn(true);
		KIX.kansaiLuggageService("luggage NO.133");
		KIX.kansaiSecurityService(true);
		KansaiAirport.kansaiRestaurantService();
		
		System.out.println("\n*************����װ��� ��õ���װ� �����̰����� �̿��� �� ����*************\n");
		// ���� ȣȯ �Ұ���
		
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
		
		System.out.println("\n*************���������*************\n");
		WonjuAirport WJU = new CombatFlyingCorps();
		WJU.wonjuCheckIn(false);
		WJU.wonjuSecurityService(true);
		WJU.wonjuluggageService(null);		// CombatFlyingCorps Ŭ������ �������� �ʾ�����
											// ���� Ŭ�������� �������� �� ����.
	}

}
