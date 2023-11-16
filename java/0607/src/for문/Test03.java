package for문;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int i, a, b;
		int sum = 0;
		int temp;

		
		Scanner sc = new Scanner(System.in);

		System.out.print("두개의 정수를 입력받아 : ");
		a = sc.nextInt();
		b = sc.nextInt();

		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}	
			
		for(i=a; i<=b; i++) {
			sum = sum + i;
		}
		
		System.out.print("두개의 정수의 합 : " + sum);

	}

}
