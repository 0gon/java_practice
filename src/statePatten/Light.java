package statePatten;

public class Light {
	/*
	private static int ON = 0; // �������� ���� ����
	private static int OFF = 1; // �������� ���� ����
	private int state; // �������� ���� ����
	*/
	
	private State state;

	public Light() {
		state = new OFF() ; // ������ �ʱ� ���´� ���� �ִ� ������
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
