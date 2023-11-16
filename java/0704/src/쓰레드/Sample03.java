package 쓰레드;

class WorkObject {
	public synchronized void methodA() {
		System.out.println("메서드A 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("메서드B 실행");
		notify();
		try {
			wait();
		} catch (Exception e) {
		}
	}
}

class ThreadA extends Thread {
	
	WorkObject wo;
	
	ThreadA(WorkObject wo) {
		this.wo = wo;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			wo.methodA();
		}
	}
	
}

class ThreadB extends Thread {
	
	WorkObject wo;
	
	ThreadB(WorkObject wo) {
		this.wo = wo;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			wo.methodB();
		}
	}
	
}

public class Sample03 {

	public static void main(String[] args) {
		
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
		
		
	}

}
