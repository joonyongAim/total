package for문;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		int num1, num2; // 숫자 저장 변수들
		int i,j; // 반복용 변수
		int sum=0, cnt=0; // 합계, 개수 저장 변수
		int temp;
		int scnt=0; //소수 판별을 위한 개수 저장 변수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력받아서 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) { // num1이 항상 작은 수, num2가 항상 큰 수
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(i=num1; i<=num2; i++) {
			
			scnt = 0;
			
			for(j=1; j<=i; j++) {
				if(i%j == 0)
					scnt++;
			}
		
			if(scnt == 2) { // i가 소수냐?
				sum = sum + i;
				cnt++;
				System.out.print( i + " ");
			}
		
		}
	
		System.out.println();
		System.out.println("소수들의 총 합계 : " + sum);
		System.out.println("소수들의 총 개수 : " + cnt);
		
		
	}
	
}


