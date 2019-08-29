package object_oriented;

public class GetterTest {
	public static void main(String[] args) {
		Access a = new Access();
		
		//a라는 참조객체를 통해 반환된 address의 객체의 값을 변경 시, 객체 a의 변수값이 변경이 이루어짐
		Address address=a.getAddress();
		address.name="강남으로 변경";
		
		System.out.println(a.getAddress().name);
		
		//b라는 참조객체를 통해 반환된 value값을 변경 시, b의 값이 변경되지 않음
		NoAccess b = new NoAccess();
		String value = b.getValue();
		value="변경값";
		
		System.out.println(b.getValue());
		
	}
}


class Access{
	 private Address AccessAddress;
	 public Access()
	 {
		 AccessAddress= new Address();
	 }
	public Address getAddress()
	 {
	  return AccessAddress;
	 } 

}

class NoAccess{
	private String value;
	public NoAccess() {
		value="초기값";
	}
	public String getValue() {
		return value;
	}
}

class Address{
	String name;
	public Address() {
		name="일산";
	}
	
}
