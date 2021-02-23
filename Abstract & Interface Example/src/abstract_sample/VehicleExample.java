package abstract_sample;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("** ���� **");
		Ford ford = new Ford();
		BMW bmw = new BMW();
		Hyundai hyundai = new Hyundai();
		
		ford.engine();
		bmw.engine();
		hyundai.engine();
		ford.handle();
		bmw.handle();
		hyundai.handle();
		
		ford.camera();
		bmw.lidar();
		hyundai.sunroof();
		
		System.out.println("** �ڵ� Ÿ�� ��ȯ **");
		Vehicle vehicle = null;
		
		vehicle = new Ford();			// �ڵ� Ÿ�� ��ȯ
		vehicle.engine();				// Ford�� ������ engine() �޼��� ����
		vehicle.handle();				// Ford�� ������ handle() �޼��� ����
		
		vehicle = new BMW();			// �ڵ� Ÿ�� ��ȯ
		vehicle.engine();				// BMW�� ������ engine() �޼��� ����
		vehicle.handle();				// BMW�� ������ handle() �޼��� ����
		
		vehicle = new Hyundai();		// �ڵ� Ÿ�� ��ȯ
		vehicle.engine();				// Hyundai�� ������ engine() �޼��� ����
		vehicle.handle();				// Hyundai�� ������ handle() �޼��� ����
		
		System.out.println("** �ڵ� Ÿ�� ��ȯ(�Ű� ���� ����) **");
		vehicleEngine(new Ford());
		vehicleEngine(new BMW());
		vehicleEngine(new Hyundai());
		vehicleHandle(new Ford());
		vehicleHandle(new BMW());
		vehicleHandle(new Hyundai());
	}

	// �߻�Ŭ���� Ÿ�� ������ �߻�Ŭ������ ��ӹ��� ��ü Ŭ������ Ÿ������ �ڵ� ��ȯ�Ѵ�.
	private static void vehicleEngine(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.engine();
	}
	
	private static void vehicleHandle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.handle();
	}
}
