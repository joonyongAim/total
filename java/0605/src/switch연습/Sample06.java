package switch연습;

import java.util.Scanner;

public class Sample06 {

	public static void main(String[] args) {
		
		int a,b;
		char c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("연산기호를 입력 : ");
		c = sc.next().charAt(0);
		
		switch(c) {
		case '+' :
			System.out.println("답 : " + (a+b) );
			break;
		case '-' :
			System.out.println("답 : " + (a-b) );
			break;
		case '*' :
			System.out.println("답 : " + (a*b) );
			break;
		case '/' :
			System.out.printf("답 : %.2f",(a/(double)b));
			break;
		case '%' :
			System.out.println("답 : " + (a%b));
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			
			
		}
		
		

	}

}
