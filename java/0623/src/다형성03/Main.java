package 다형성03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Driver driver = new Driver("홍길동");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어떤거 운행하심?");
		System.out.print("[1]버스 [2]택시");
		int ch = sc.nextInt();
		
		if(ch == 1) {
			driver.drive(new Bus());
		} else {
			driver.drive(new Taxi());
		}
		

	}

}
