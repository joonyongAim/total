package 쓰레드;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("| 시간 : " + (endTime - Sample04.startTime));
	}
	
}

public class Sample04 {
	
	static long startTime = 0;

	public static void main(String[] args) {
		Thread t = new MyThread();
		
		t.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("- 시간 : " + (endTime - Sample04.startTime));

	}

}
