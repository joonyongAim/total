package while문;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int i=1,j=1,a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		a = sc.nextInt();
		
		while(i<=a) {
			j = 1;
			while(j <= i) {
				// 별찍는 반복
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
