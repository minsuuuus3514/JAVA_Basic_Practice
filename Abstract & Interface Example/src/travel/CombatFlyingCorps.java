package travel;

import travel.WonjuAirport;

public class CombatFlyingCorps implements WonjuAirport {

	@Override
	public void wonjuCheckIn(boolean check) {
		// TODO Auto-generated method stub
		if(check == true) {
			System.out.println("����������� üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}

	@Override
	public void wonjuSecurityService(boolean check) {
		// TODO Auto-generated method stub
		if(check == true) {
			System.out.println("����������� �������� üũ��");
		} else {
			System.out.println("��������� ���� ���");
		}
	}
	
}
