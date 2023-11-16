package while문;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		int cnt; //인원수 저장 변수
		int i=1;
		int score; // 성적 저장 변수
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수를 입력하세요 : ");
		cnt = sc.nextInt();
		
		
		while(i <= cnt) {
			System.out.print(i + "번째 학생 성적 입력 : ");
			score = sc.nextInt();
			
			sum = sum + score;
			
			i++;
			
		}System.out.println("합 : " + sum);
		System.out.println("평균 : " + (double)sum / cnt);	
			
			
	}

}
