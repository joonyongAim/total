package 쓰레드2;

class IThread extends Thread {

	@Override
	public void run() {
		try {
			int i=1;
			while(true) {
				System.out.println(i++);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
		System.out.println("쓰레드 종료");
	}
	
}

public class Sample01 {

	public static void main(String[] args) {
		
		Thread t = new IThread();
		
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		
		t.interrupt();
		
		System.out.println("메인 종료");
	}

}
