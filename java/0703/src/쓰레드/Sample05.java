package 쓰레드;

import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

class Th extends Thread {

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (Exception e) {
			}
		}
	}
	
	
}

public class Sample05 {

	public static void main(String[] args) {
		System.out.println("--메인 쓰레드 시작--");
		Thread t = new Th();
		t.start();
		
		String input = JOptionPane.showInputDialog("입력");
		System.out.println("입력된 내용 : " + input);
		
		System.out.println("--메인 쓰레드 종료--");

	}

}
