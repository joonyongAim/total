package 쓰레드;

class A implements Runnable {

	@Override
	public void run() {
		System.out.println("시작 : " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		
		System.out.println("종료 : " + Thread.currentThread().getName());
	}
	
}

public class Sample07 {

	public static void main(String[] args) {
		
		ThreadGroup g = new ThreadGroup("그룹명");
		
		Thread t1 = new Thread(g, new A(), "쓰레드1");
		Thread t2 = new Thread(g, new A(), "쓰레드2");
		
		t1.start();
		t2.start();
		
		g.list();
		
		try {
			Thread.sleep(2500);
			System.out.println(g.activeCount());
		} catch (Exception e) {
		}
		
		

	}

}
