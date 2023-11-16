package while문;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받아서 : ");
		a = sc.nextInt();
		
		while(a!=0) {
			
			sum = sum + (a % 10); // 마지막 숫자 때서 더함
			a = a / 10; // 마지막 숫자 제거
		}

		System.out.println("합계 : " + sum);
	}

}
