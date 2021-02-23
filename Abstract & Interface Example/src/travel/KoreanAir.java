package travel;

import travel.IncheonAirport;
import travel.KansaiAirport;

public class KoreanAir implements IncheonAirport, KansaiAirport {

	@Override
	public void kansaiCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[�����̰���] �����װ����� üũ�� ����");
		if(check == true) {
			System.out.println("�����װ� �Ϲ� üũ��");
			System.out.println("�����װ� ����Ʈ üũ��");
			System.out.println("�����װ� QR üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}
	
	@Override
	public void kansaiSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[�����̰���] �����װ����� ���� �˻�");
		if(check == true) {
			System.out.println("���Ȱ˻� ���");
		} else {
			System.out.println("���Ȱ˻� ��� ��");
		}
	}
	
	@Override
	public void incheonCheckIn(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[��õ����] �����װ����� üũ�� ����");
		if(check == true) {
			System.out.println("�����װ� �Ϲ� üũ��");
			System.out.println("�����װ� ����Ʈ üũ��");
			System.out.println("�����װ� QR üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}

	@Override
	public void incheonSecurityService(boolean check) {
		// TODO Auto-generated method stub
		System.out.println("[��õ����] �����װ����� ���� �˻�");
		if(check == true) {
			System.out.println("���Ȱ˻� ���");
		} else {
			System.out.println("���Ȱ˻� ��� ��");
		}
	}
	
	// default �޼��� : ���� �ȳ� ����(�ʼ� ������ ���� ����)
	public String robotInfo() {
		System.out.println("��õ ���� �κ� �ȳ� ���񽺸� ���� ���Դϴ�.");
		return "�κ��ȳ� ����";	
	}
	
	// default ��õ���� ���Ϲ� ���� ���� �̿�
	public String incheonLuggageService(String luggage) {
		System.out.println("** ��õ���׿��� �����ϴ� ���Ϲ� ���� ���� �̿� �� **");
		return "���Ϲ� ���� ����";
	}
	
	// default �����̰��� ���Ϲ� ���� ���� �̿�
	public String kansaiLuggageService(String luggage) {
		System.out.println("** �����̰��׿��� �����ϴ� ���Ϲ� ���� ���� �̿� �� **");
		return "���Ϲ� ���� ����";
	}
	
	// static
	static void incheonRestaurantService() {
		System.out.println("��õ���� �Ĵ簡 �̿� �����մϴ�.");
	}
	
	static void kansaiRestaurantService() {
		System.out.println("�����̰��� �Ĵ簡 �̿� �����մϴ�.");
	}
}
