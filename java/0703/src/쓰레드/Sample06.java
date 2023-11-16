package 쓰레드;

class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
	}

}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}

}

	
public class Sample06 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.setPriority(10);
		
		System.out.println("t1 : " + t1.getPriority());
		System.out.println("t2 : " + t2.getPriority());
		
		t1.start();
		t2.start();

	}

}
