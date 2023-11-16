package if연습;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 주사위 : ");
		a = sc.nextInt();
		System.out.print("두번째 주사위 : ");
		b = sc.nextInt();
		System.out.print("세번째 주사위 : ");
		c = sc.nextInt();
		
		
		if(a == b && a == c) {
			System.out.println("상금은 : " + (10000+a*1000) + "원입니다.");
		}else if(a == b || c == a) {
			System.out.println("상금은 : " + (1000+a*100) + "원입니다.");
		}else if(b == c) {
			System.out.println("상금은 : " + (1000+b*100) + "원입니다.");
		}
		else {
			if(a > b && a > c) {
				System.out.println("상금은 : " + (a*100) + "원입니다.");
			}else if(b > a && b > c) {
				System.out.println("상금은 : " + (b*100) + "원입니다.");
			}else {
				System.out.println("상금은 : " + (c*100) + "원입니다.");
			}
		}

	}
}
