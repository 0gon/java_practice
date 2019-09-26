package statePatten;

public class OFF implements State{
	private static OFF off = new OFF(); //ON Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	
	public static OFF getInstance() { //�ʱ�ȭ�� ONŬ������ �ν��Ͻ��� ��ȯ��
		return off;
	}
	@Override
	public void on_button_pushed(Light light) {
		light.setState(ON.getInstance());
		System.out.println("Light On");
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("��������");
	}

}
