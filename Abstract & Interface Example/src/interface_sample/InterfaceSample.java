package interface_sample;

public interface InterfaceSample {

	// ���
	public String USER_MESSAGE = null;
	
	// �߻� �޼���
	void send(String msg);
	
	void recieve(String msg);
	
	// ����Ʈ �޼���
	default String flexibleMethod(String flexible) {
		System.out.println("�������̽����� ������ ������ ���� �ȵ�� �˾Ƽ� ���� ���.");
		return "���������� ����ϴ� �޼���";
	}
	
	// ���� �޼���
	static void staticMethod(String fixed) {
		System.out.println("�̰� �׳� �ִ´�� ���.");
	}
}
