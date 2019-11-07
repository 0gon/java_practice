package threadChapter.unit1;

public class MyRun implements Runnable{

	@Override
	public void run() {
		show();
	}
	
	public void show() {
		for(int i = 0 ; i < 500; i++) {
			System.out.print("S");
		}
	}
	

}
