package abstract_sample;

public class Hyundai extends Vehicle {
	
	public Hyundai() {
		this.wheels = 4;
	}
	
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 엔진");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("전동 핸들");
	}
	
	public void sunroof() {
		System.out.println("현대의 선루프는 햇빛이 들어오게 함.");
	}

}
