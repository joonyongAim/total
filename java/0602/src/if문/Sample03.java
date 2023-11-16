package if문;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		
		int score = 0; // 점수 저장 변수
		char grade = ' '; // 학점 저장 변수 ( A, B, C)
		char opt = ' '; // + - 저장 변수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		System.out.println("당신의 점수는 " + grade + opt + "입니다.");
	}

}
