package abstract_sample;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("** 가본 **");
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
		
		System.out.println("** 자동 타입 변환 **");
		Vehicle vehicle = null;
		
		vehicle = new Ford();			// 자동 타입 변환
		vehicle.engine();				// Ford에 구현된 engine() 메서드 실행
		vehicle.handle();				// Ford에 구현된 handle() 메서드 실행
		
		vehicle = new BMW();			// 자동 타입 변환
		vehicle.engine();				// BMW에 구현된 engine() 메서드 실행
		vehicle.handle();				// BMW에 구현된 handle() 메서드 실행
		
		vehicle = new Hyundai();		// 자동 타입 변환
		vehicle.engine();				// Hyundai에 구현된 engine() 메서드 실행
		vehicle.handle();				// Hyundai에 구현된 handle() 메서드 실행
		
		System.out.println("** 자동 타입 변환(매개 변수 가능) **");
		vehicleEngine(new Ford());
		vehicleEngine(new BMW());
		vehicleEngine(new Hyundai());
		vehicleHandle(new Ford());
		vehicleHandle(new BMW());
		vehicleHandle(new Hyundai());
	}

	// 추상클래스 타입 변수는 추상클래스를 상속받은 실체 클래스이 타입으로 자동 변환한다.
	private static void vehicleEngine(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.engine();
	}
	
	private static void vehicleHandle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.handle();
	}
}
