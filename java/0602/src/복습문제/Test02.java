package 복습문제;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int a,b,c;
		int sum;
		double avg;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 : ");
		a = sc.nextInt();
		System.out.print("영어 점수를 입력 : ");
		b = sc.nextInt();
		System.out.print("수학 점수를 입력 : ");
		c = sc.nextInt();
		
		sum = a + b+ c;
		avg = sum / 3.0;
		
		
		System.out.println("점수 총합 : " + sum);
		System.out.printf("점수 평균 : %.1f ", avg);
		
		
		
		
		
		
		
		
		
		
		

	}

}
