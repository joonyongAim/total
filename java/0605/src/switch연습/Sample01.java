package switch연습;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자입력하세요 : ");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A' :
			System.out.println("최우수");
			break;
		case 'B' :
			System.out.println("우수");
			break;
		case 'C' :
			System.out.println("장려");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		

	}

}





