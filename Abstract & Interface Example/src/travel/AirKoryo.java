package travel;

public class AirKoryo {

	public void pyeongyangCheckIn(boolean check) {
		System.out.println("[������] ����װ����� üũ�� ����");
		if(check == true) {
			System.out.println("�Ϲ� üũ��");
		} else {
			System.out.println("üũ�� ��� ��");
		}
	}
	
	public void pyeongyangSecurityService(boolean check) {
		System.out.println("[������] ����װ����� ���Ȱ˻�");
		if(check == true) {
			System.out.println("���Ȱ˻� ���");
		} else {
			System.out.println("���Ȱ˻� ��� ��");
		}
	}
	
	public void pyeongyangRestaurantService() {
		System.out.println("�����׸��� �Ĵ簡");
	}
}
