package 쓰레드2;

class DepreThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		
	}
	
}

public class Sample03 {

	public static void main(String[] args) {
		
		Runnable r = new DepreThread();
		
		Thread t1 = new Thread(r, "쓰레드-1");
		Thread t2 = new Thread(r, "쓰레드-2");
		Thread t3 = new Thread(r, "쓰레드-3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
			t1.suspend(); // 일시중지
			
			Thread.sleep(3000);
			t2.suspend(); // 일시중지
			
			Thread.sleep(3000);
			t1.resume(); // 동작
			
			Thread.sleep(3000);
			t3.stop(); // 쓰레드 종료
			t2.resume(); // 동작
			
			Thread.sleep(3000);
			t1.stop();
			t2.stop();
		} catch (Exception e) {
			
		}

	}

}
