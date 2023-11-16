package 쓰레드2;

class SumThread extends Thread {
	int sum=0;
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("쓰레드 종료");
	}
	
}

public class Sample05 {

	public static void main(String[] args) {
		
		SumThread t = new SumThread();
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		
		System.out.println("결과 : " + t.sum);

	}

}
