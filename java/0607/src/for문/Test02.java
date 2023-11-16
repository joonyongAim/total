package for문;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		int i, a;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력받아 : ");
		a = sc.nextInt();

		for (i = 1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 입력받은 정수까지의 합계 : " + sum);

	}

}
