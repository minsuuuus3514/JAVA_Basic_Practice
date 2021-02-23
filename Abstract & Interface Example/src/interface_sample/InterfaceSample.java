package interface_sample;

public interface InterfaceSample {

	// 상수
	public String USER_MESSAGE = null;
	
	// 추상 메서드
	void send(String msg);
	
	void recieve(String msg);
	
	// 디폴트 메서드
	default String flexibleMethod(String flexible) {
		System.out.println("인터페이스에서 제공은 하지만 맘에 안들면 알아서 만들어서 써라.");
		return "선택적으로 사용하는 메서드";
	}
	
	// 정적 메서드
	static void staticMethod(String fixed) {
		System.out.println("이건 그냥 주는대로 써라.");
	}
}
