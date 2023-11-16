package 쓰레드;

class DThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				System.out.println("자동저장 되었습니다.");
			} catch (Exception e) {
			}
		}
		
	}
	
}

public class Sample09 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new DThread());
		t.setDaemon(true);
		t.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (Exception e) {
			}
		}
		
		System.out.println("---메인 종료---");

	}

}
