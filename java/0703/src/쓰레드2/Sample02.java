package 쓰레드2;

class FlagThread extends Thread {
	
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		int i=0;
		while(!stop) {
			System.out.println(i++);
		}
		System.out.println("쓰레드 종료");
	}
	
}

public class Sample02 {

	public static void main(String[] args) {
		
		FlagThread t = new FlagThread();
		
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		
		t.setStop(true);
		
		System.out.println("메인 종료");

	}

}
