package abstract_sample;

public class Ford extends Vehicle {

	public Ford() {
		this.wheels = 4;
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("���ָ� ����");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("���� �ڵ�");
	}
	
	public void camera() {
		System.out.println("������ ī�޶�� ���� ����� ��ȭ�Ѵ�.");
	}

}
