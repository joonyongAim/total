package 쓰레드;

class Number{
	int cnt=0;
	public synchronized void methodA() {
		cnt++;
		System.out.println(cnt);
		notify();
		try {
			wait();
		} catch (Exception e) {
		}
	}
	
	public synchronized void methodB() {
		cnt++;
		System.out.println(cnt);
		notify();
		try {
			wait();
		} catch (Exception e) {
		}
	}
}

class NumberA extends Thread {
	
	Number n;
	
	NumberA(Number n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			n.methodA();
		}
	}
}

class NumberB extends Thread {
	
	Number n;
	
	NumberB(Number n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			n.methodB();
		}
	}
}

public class Practice {

	public static void main(String[] args) {
		
		Number n = new Number();
		
		NumberA na = new NumberA(n);
		NumberB nb = new NumberB(n);
		
		na.start();
		nb.start();
		

	}

}
