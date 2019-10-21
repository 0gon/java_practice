package threadChapter.unit4;

public class CakePlate {
	private int breadCount = 0 ;
	public CakePlate() {
	}
	
	public synchronized void makeBread() {
		if(breadCount>=10) {
			try {
				System.out.println("»§ÀÌ ³²´Â´Ù.");
				wait();
			}catch(InterruptedException ire) {}
		breadCount--;
		System.out.println("»§À» 1°³ ¸ÔÀ½ ÃÑ:"+breadCount+"°³");
		this.notifyAll();
			
		}
	}
	
}
