package 쓰레드2;

class ThreadA extends Thread {
	
	boolean stop;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("쓰레드A 작동중");
			} else {
				Thread.yield();
			}
		}
	}
	

}


class ThreadB extends Thread {
	
	boolean stop;
	boolean work = true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("쓰레드B 작동중");
			} else {
				Thread.yield();
			}
		}
	}
	
}

public class Sample04 {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		ta.work = false;
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		ta.work = true;
		tb.work = false;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		ta.stop = true;
		tb.stop = true;

	}

}
