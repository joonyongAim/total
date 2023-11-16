package if연습;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력받아 : ");
		a = sc.nextInt();
		
		if((a % 4) == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("o");
		}else {
			System.out.println("x");
		}
		
		

	}

}
