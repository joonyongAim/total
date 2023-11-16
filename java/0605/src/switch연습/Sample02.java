package switch연습;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력받아 : ");
		a = sc.nextInt();
		
		switch(a / 10) {
		case 1: 
			System.out.println("F");
			break;
		case 2: 
			System.out.println("D");
			break;
		case 3: 
			System.out.println("C");
			break;
		case 4: 
			System.out.println("B");
			break;
		default :
			System.out.println("A");
		}
	}

}
