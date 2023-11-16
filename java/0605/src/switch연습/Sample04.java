package switch연습;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받아 : ");
		a = sc.nextInt();
		
		switch(a % 5) {
		case 0 :
			System.out.println("o");
			break;
		default :
			System.out.println("x");
			
		}
		
		

	}

}
