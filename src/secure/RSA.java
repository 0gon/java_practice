package secure;

public class RSA {
	public static final int START=200;
	private int p = 11;
	private int q = 7;
	private int n;
	private int phiN;
	private int e;
	private int d;
	public void makePQ() {
		p=(int)(Math.random()*START);
		q=(int)(Math.random()*START);
		
		//while((p==q)||(p<100||q<100)||(!Java200Math.isPrime(p)||!Java200Math.isPrime(q))) {
		//}
	}
}
