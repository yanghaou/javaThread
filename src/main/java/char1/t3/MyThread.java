package char1.t3;

public class MyThread extends Thread {

	private int count=5;

	@Override
	synchronized public void run() {
		super.run();
		count--;
		System.out.println("由"+this.currentThread().getName()+" 计算count="+count);
	}
}
