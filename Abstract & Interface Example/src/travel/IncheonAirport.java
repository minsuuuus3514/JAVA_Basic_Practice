package travel;

public interface IncheonAirport {
	
	public boolean CHECK_IN = false;
	
	// �߻�Ŭ���� : �װ��纰�� ������ üũ�� ���� ����
	void incheonCheckIn(boolean check);
	// �߻�Ŭ���� : ��õ���� ���� �˻�
	void incheonSecurityService(boolean check);
		
	// �����޼��� : �Ĵ簡�� ���� �Ұ����ϴ�. �����ִ� ������ ������ ���
	static void incheonRestaurantService() {
		System.out.println("��õ���� �Ĵ簡 �̿�");
	}
	
	// default �޼��� : ���� �ȳ� ����(�ʼ� ������ ���� ����)
	default String robotInfo(String robot) {
		System.out.println("�κ� �ȳ�");
		return "�κ��ȳ� ����";	
	}
	
	// default �޼��� : �� ���Ϲ� ���� ����(�ʼ� ������ ���� ����)
	default String incheonLuggageService(String luggage) {
		System.out.println("** ��õ���׿��� �����ϴ� ���Ϲ� ���� ���� **");
		return "���Ϲ� ���� ����";
	}
	
}
