package object_oriented;

public class SetterTest {
	public static void main(String[] args) {
		//setter를 통해서 해당 객체의 인스턴스 변수값의 변화가 이루어지게끔
		User a = new User(10);
		a.setValue(20);
		System.out.println(a.getValue()); // 20
		
		/*
		 * 
		 * 절대적으로 필요한 경우가 아니라면, 접근자(getter/setter) 메
			소드를 사용하지 말아라. 왜냐하면, 이들 메소드들은 클래스가 구현되어 있는 방식에 관한
			정보를 노출해 결과적으로 코드의 유지 보수를 더 어렵게 만들기 때문이다
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
