package abstract_sample;

public class Hyundai extends Vehicle {
	
	public Hyundai() {
		this.wheels = 4;
	}
	
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("���̺긮�� ����");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("���� �ڵ�");
	}
	
	public void sunroof() {
		System.out.println("������ �������� �޺��� ������ ��.");
	}

}
