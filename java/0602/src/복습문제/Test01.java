package 복습문제;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		String a,d;
		int b;
		char c;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		a = sc.next();
		
		System.out.print("나이을 입력하세요 : ");
		b = sc.nextInt();
		
		System.out.print("성별을 입력하세요 : ");
		c = sc.next().charAt(0);
		
		System.out.print("전화번호을 입력하세요 : ");
		d = sc.next();
		
		
		
		
		System.out.println("이름 : " + a);
		System.out.println("나이 : " + b);
		System.out.println("성별 : " + c);
		System.out.println("전화번호 : " + d);
				
		

	}

}
