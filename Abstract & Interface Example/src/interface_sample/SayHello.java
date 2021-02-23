package interface_sample;

public class SayHello extends SayMyName implements InterfaceA, InterfaceB {

	private String msg;
	
	public SayHello(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String functionA() {
		// TODO Auto-generated method stub
		msg = "æ»≥Á«œººø‰.";
		return msg;
	}
	
	@Override
	public String functionB() {
		// TODO Auto-generated method stub
		msg = "Hello.";
		return msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SayHello sh = new SayHello("Hello!");
		SayMyName sn = new SayMyName();
		
		System.out.println(sh.functionA());
		System.out.println(sh.functionB());
		sn.myName();
	}

}
