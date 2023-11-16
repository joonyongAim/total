package do_while문;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		
		int input = 0; // 유저가 입력하는 숫자 저장 변수
		int answer = 0; // 정답 저장하는 변수(난수 저장)
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		answer = (int)(Math.random() * 100) + 1;
		
		do {
			System.out.print("1~100사이 숫자 입력 : ");
			input = sc.nextInt();
			cnt++;
			
			if(input > answer) {
				System.out.println("입력한 숫자보다 작습니다.");
			}else if(input < answer) {
				System.out.println("입력한 숫자보다 큽니다.");
			}
			
		} while(input != answer);
		
		System.out.println("정답입니다.");
		System.out.println(cnt + "번만에 맞췄습니다.");

	}

}
