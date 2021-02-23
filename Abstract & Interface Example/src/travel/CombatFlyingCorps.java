package travel;

import travel.WonjuAirport;

public class CombatFlyingCorps implements WonjuAirport {

	@Override
	public void wonjuCheckIn(boolean check) {
		// TODO Auto-generated method stub
		if(check == true) {
			System.out.println("전투비행단의 체크인");
		} else {
			System.out.println("체크인 대기 중");
		}
	}

	@Override
	public void wonjuSecurityService(boolean check) {
		// TODO Auto-generated method stub
		if(check == true) {
			System.out.println("전투비행단의 전투비행 체크인");
		} else {
			System.out.println("전투비행단 비행 대기");
		}
	}
	
}
