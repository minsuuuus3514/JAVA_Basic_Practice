package abstract_sample;

public class BMW extends Vehicle {

	public BMW() {
		this.wheels = 4;
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("���� ����");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("���� �ڵ�");
	}
	
	public void lidar() {
		System.out.println("BMW�� ���̴ٴ� ������ �����Ѵ�.");
	}

}
