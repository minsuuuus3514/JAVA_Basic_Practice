package abstract_sample;

public class Ford extends Vehicle {

	public Ford() {
		this.wheels = 4;
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("가솔린 엔진");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("유압 핸들");
	}
	
	public void camera() {
		System.out.println("포드의 카메라는 주행 기록을 녹화한다.");
	}

}
