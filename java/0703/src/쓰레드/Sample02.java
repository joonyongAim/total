package 쓰레드;

public class Sample02 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				System.out.println("hello");
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		
		System.out.println("메인 종료");
	}

}
