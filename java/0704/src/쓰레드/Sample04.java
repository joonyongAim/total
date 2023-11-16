package 쓰레드;

class NumberThread extends Thread {
	
	int n;
	Object lock;
	
	public NumberThread(int n, Object lock) {
		this.n = n;
		this.lock = lock;
	}
	
	@Override
	public void run() {
		while(n <= 10) {
			synchronized (lock) {
				System.out.println(n);
				n = n + 2;
				lock.notify();
				try {
					lock.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // synchronized
		} // while
	}

}

public class Sample04 {

	public static void main(String[] args) {
		
		Object lock = new Object();
		
		NumberThread t1 = new NumberThread(1, lock);
		NumberThread t2 = new NumberThread(2, lock);
		
		t1.start();
		t2.start();
		

	}

}
