package chapter;

public class AesStart {
	public static void main(String[] args) {
		String a= Aes128_2.Encrypt128("암호화되지 않은 메세지");
		System.out.println(a);
		String b = Aes128_2.Decrypt128(a);
		System.out.println(b);
	}
}
