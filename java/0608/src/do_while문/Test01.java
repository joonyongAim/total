package do_while문;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int a,i=1,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받아서 : ");
		a = sc.nextInt();
		
		
		do {
			sum = sum + i;
			i++;
		} while(i<=a);
		System.out.println("합계 : " + sum);	

	}

}
