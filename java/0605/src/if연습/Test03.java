package if연습;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력받아 : ");
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
		
		

	}

}
