package travel;

public interface KansaiAirport {

	public boolean CHECK_IN = false;
	
	// �߻�Ŭ���� : �װ��纰�� ������ üũ�� ���� ����
	void kansaiCheckIn(boolean check);
	// �߻�Ŭ���� : �װ��纰�� ������ ����� ���� ����
	void kansaiSecurityService(boolean check);
	
	// �����޼��� : �Ĵ簡�� ���� �Ұ����ϴ�. �����ִ� ������ ������ ���
	static void kansaiRestaurantService() {
		System.out.println("�����̰��� �Ĵ簡 �̿�.");
	}
	
	// default �޼��� : �� ���Ϲ� ���� ����(�ʼ� ������ ���� ����)
	default String kansaiLuggageService(String luggage) {
		System.out.println("** �����̰��׿��� �����ϴ� ���Ϲ� ���� ���� **");
		return "���Ϲ� ���� ����";
	}
	
}
