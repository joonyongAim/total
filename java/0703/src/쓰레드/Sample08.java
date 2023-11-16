package 쓰레드;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Ab implements Runnable {
	
	String name;
	
	Ab(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("시작 : " + name);
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		
		System.out.println("종료 : " + name);
	}
	
}


public class Sample08 {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		es.execute(new Ab("쓰레드1"));
		es.execute(new Ab("쓰레드2"));
		es.execute(new Ab("쓰레드3"));
		
		es.shutdown();
		
		es.execute(new Ab("쓰레드4"));
//		es.execute(new Ab("쓰레드5"));
//		es.execute(new Ab("쓰레드6"));
	}

}
