package abstract_sample;

public abstract class Vehicle {

	public int wheels;
	
	public void drive() {
		System.out.println("주행한다.");
	}
	
	public abstract void engine();
	
	public abstract void handle();
	
}
