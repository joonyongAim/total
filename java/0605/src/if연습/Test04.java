package if연습;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력받아 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > c && a > b) {
			System.out.println("최대값 : " + a);
		}else if(b > a && b > c) {
			System.out.println("최대값 : " + b);
		}else {
			System.out.println("최대값 : " + c);
		}
		if(a < c && a < b) {
			System.out.println("최소값 : " + a);
		}else if(b < a && b < c) {
			System.out.println("최소값 : " + b);
		}else {
			System.out.println("최소값 : " + c);
		}
		
	}
	
}