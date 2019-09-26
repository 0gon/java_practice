package statePatten;

public class OFF implements State{
	private static OFF off = new OFF(); //ON 클래스의 인스턴스로 초기화
	
	public static OFF getInstance() { //초기화된 ON클래스의 인스턴스를 반환함
		return off;
	}
	@Override
	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On");
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("반응없음");
	}

}
