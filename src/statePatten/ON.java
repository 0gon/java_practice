package statePatten;

public class ON implements State{
	
	private static ON on = new ON(); //ON Ŭ������ �ν��Ͻ��� �ʱ�ȭ
	public static ON getInstance() { //�ʱ�ȭ�� ONŬ������ �ν��Ͻ��� ��ȯ��
		return on;
	}
	
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("��������");
	}

	@Override
	public void off_button_pushed(Light light) {
		light.setState(OFF.getInstance());
		System.out.println("Light Off!");
		
	}

}
