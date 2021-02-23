package travel;

import travel.IncheonAirport;
import travel.KansaiAirport;

public class JapanAirLines implements KansaiAirport, IncheonAirport {

	@Override
	public void incheonCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[��õ����] �Ϻ��װ����� üũ�� ����");
		if(check == true) {
			System.out.println("�Ϻ��װ� �Ϲ� üũ��");
			System.out.println("�Ϻ��װ� ����Ʈ üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}

	@Override
	public void incheonSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[��õ����] �Ϻ��װ����� ���� �˻�");
		if(check == true) {
			System.out.println("���Ȱ˻� ���");
		} else {
			System.out.println("���Ȱ˻� ��� ��");
		}
	}

	@Override
	public void kansaiCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[�����̰���] �Ϻ��װ����� üũ�� ����");
		if(check == true) {
			System.out.println("�Ϻ��װ� �Ϲ� üũ��");
			System.out.println("�Ϻ��װ� ����Ʈ üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}

	@Override
	public void kansaiSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[��õ����] �Ϻ��װ����� ���� �˻�");
		if(check == true) {
			System.out.println("���Ȱ˻� ���");
		} else {
			System.out.println("���Ȱ˻� ��� ��");
		}
	}
	
	// �����̰��� ���Ϲ� ���� ���� �̿�
	public String kansaiLuggageService(String luggage) {
		System.out.println("** �����̰��׿��� �����ϴ� ���Ϲ� ���� ���� �̿� �� **");
		return "���Ϲ� ���� ����";
	}
	
	static void kansaiRestaurantService() {
		System.out.println("�����̰��� �Ĵ簡 �̿� �����մϴ�.");
	}
	
}
