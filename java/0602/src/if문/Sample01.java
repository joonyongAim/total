package if문;

import java.util.Scanner;

public class Sample01 {
// 점수를 입력받아 입력한 점수가 80이상이면 합격, 아니면 불합격 출력
	public static void main(String[] args) {
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score >= 80) {
			// 조건식이 참인 경우 작업할 코드
			System.out.print("합격");
		} else {
			// 조건식이 거짓인 경우 작업할 코드
			System.out.print("불합격");
			
		}
		
		}
			

	}


