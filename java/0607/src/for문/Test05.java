package for문;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		
		int i,a;
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받아 : ");
		a = sc.nextInt();
		
		for(i=1;i<=a;i++) {
			if(a % i ==0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수아님");
		}
		
		
		
		
		
				
		
		
	}

}
