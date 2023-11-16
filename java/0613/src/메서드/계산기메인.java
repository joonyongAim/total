package 메서드;

import java.util.Scanner;

public class 계산기메인 {

	public static void main(String[] args) {
		
		계산기 ga = new 계산기();
		int a,b;
		char op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력받아 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산기호를 입력 : ");
		op = sc.next().charAt(0);
		
		ga.showInfo(a, b, op);
		
	}

}
