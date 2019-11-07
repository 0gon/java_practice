package threadChapter.unit3;

public class MyRuns2 implements Runnable {
	private int i = 0;
	@Override
	public void run(){
		show();
	}
	public void show() {
		for( ; i < 500; i++) {
			if(((Thread.currentThread()).getName()).equals("a")) {
				System.out.print("A");
			}else if(((Thread.currentThread()).getName()).equals("b")) {
				System.out.print("B");
			}else if(((Thread.currentThread()).getName()).equals("c")) {
				System.out.print("C");
			}else {
				System.out.print("["+Thread.currentThread().getName()+i+"]");
			}
		}
	}
}
