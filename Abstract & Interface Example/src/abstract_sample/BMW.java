package abstract_sample;

public class BMW extends Vehicle {

	public BMW() {
		this.wheels = 4;
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("디젤 엔진");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("전동 핸들");
	}
	
	public void lidar() {
		System.out.println("BMW의 라이다는 차선을 감지한다.");
	}

}
