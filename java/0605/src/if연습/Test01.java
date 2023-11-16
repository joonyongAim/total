package if연습;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 점수를 입력받아 : ");
		a = sc.nextInt();b = sc.nextInt();
		
		if((a + b) >= 150) {
			System.out.println("합격");
	    }else {
			System.out.println("불합격");
			
		}
		
		
		

	}

}
