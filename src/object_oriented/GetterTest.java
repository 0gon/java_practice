package object_oriented;

public class GetterTest {
	public static void main(String[] args) {
		Access a = new Access();
		
		//a��� ������ü�� ���� ��ȯ�� address�� ��ü�� ���� ���� ��, ��ü a�� �������� ������ �̷����
		Address address=a.getAddress();
		address.name="�������� ����";
		
		System.out.println(a.getAddress().name);
		
		//b��� ������ü�� ���� ��ȯ�� value���� ���� ��, b�� ���� ������� ����
		NoAccess b = new NoAccess();
		String value = b.getValue();
		value="���氪";
		
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
		value="�ʱⰪ";
	}
	public String getValue() {
		return value;
	}
}

class Address{
	String name;
	public Address() {
		name="�ϻ�";
	}
	
}
