package travel;

public interface WonjuAirport {

	public boolean CHECK_IN = false;
	
	// �߻�Ŭ���� : �װ��纰�� ������ üũ�� ���� ����
	void wonjuCheckIn(boolean check);
	
	void wonjuSecurityService(boolean check);
	
	// �����޼��� : �Ĵ簡�� ���� �Ұ����ϴ�. �����ִ� ������ ������ ���
	static void wonjuRestaurantService() {
		System.out.println("���ְ��� �Ĵ簡 �̿� �����մϴ�.");
	}
	
	// default �޼��� : �� ���Ϲ� ���� ����(�ʼ� ������ ���� ����)
	default String wonjuluggageService(String luggage) {
		System.out.println("** ���ְ��׿��� �����ϴ� ���Ϲ� ���� ���� **");
		return "���Ϲ� ���� ����";
	}
}
