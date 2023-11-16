package if문;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		
		int score;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score >= 80) {
			System.out.println("상");
		}else if(score >= 60) {
			System.out.println("중");
		}else {
			System.out.println("하");
		}
		

	}

}
