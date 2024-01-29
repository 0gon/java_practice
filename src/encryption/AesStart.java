package encryption;

public class AesStart {
	public static void main(String[] args) {
		String a= Aes128_2.Encrypt128("��ȣȭ���� ���� �޼���");
		System.out.println(a);
		String b = Aes128_2.Decrypt128(a);
		System.out.println(b);
	}
}
