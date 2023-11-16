package 쓰레드;
// Thread클래스 상속
class MyThread1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(getName());
		}
	}
	
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}




public class Sample01 {

	public static void main(String[] args) {
		
		Thread t1 = new MyThread1();
		
		Runnable r = new MyThread2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		try {
		Thread.sleep(5000);
		} catch (Exception e) {
		}
		System.out.println("main 종료");

	}

}
