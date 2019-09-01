package object_oriented;

public class SetterTest {
	public static void main(String[] args) {
		//setter�� ���ؼ� �ش� ��ü�� �ν��Ͻ� �������� ��ȭ�� �̷�����Բ�
		User a = new User(10);
		a.setValue(20);
		System.out.println(a.getValue()); // 20
		
		/*
		 * 
		 * ���������� �ʿ��� ��찡 �ƴ϶��, ������(getter/setter) ��
			�ҵ带 ������� ���ƶ�. �ֳ��ϸ�, �̵� �޼ҵ���� Ŭ������ �����Ǿ� �ִ� ��Ŀ� ����
			������ ������ ��������� �ڵ��� ���� ������ �� ��ư� ����� �����̴�
		 * 
		 * */
		//https://kldp.org/files/setter__getter_______________________176.pdf
		
	}
}

class User {
	private int value ;
	
	public User(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
