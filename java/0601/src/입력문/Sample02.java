package 입력문;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		int x;
		int y;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력받아 : ");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("두 정수의 합 : " + (x + y));
		System.out.println("두 정수의 차 : " + (x - y));
		System.out.println("두 정수의 곱 : " + (x * y));
		System.out.println("두 정수의 나누기 : " + ((double)x / y));
		System.out.println("두 정수의 나머지 : " + (x % y));
		
		
		
		

	}

}
