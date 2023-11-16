package if연습;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int a,b;
		int sum;
		double avg;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 점수를 입력받아 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		sum = a + b;
		avg = sum / 2.0;
		
		
		if(a + b >= 150 && (a + b) / 2 >= 80) {
			System.out.println("합계 : " + sum + " 평균 : " + avg + " 합격");
		}else {
			System.out.println("합계 : " + sum + " 평균 : " + avg + " 불합격");
		}
		

	}

}
