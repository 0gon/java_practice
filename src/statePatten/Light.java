package statePatten;

public class Light {
	/*
	private static int ON = 0; // 형광등이 켜진 상태
	private static int OFF = 1; // 형광등이 꺼진 상태
	private int state; // 형광등의 현재 상태
	*/
	
	private State state;

	public Light() {
		state = new OFF() ; // 형광등 초기 상태는 꺼져 있는 상태임
	}
	
	public void setState(State state) {
		this.state=state;
	}
	public void on_button_pushed() {
		state.on_button_pushed(this);
	}
	public void off_button_pushed() {
		state.off_button_pushed(this);
	}
}
