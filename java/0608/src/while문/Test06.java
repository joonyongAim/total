package while문;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		int i,a=1;
		int cnt;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력(종료 : 0)");
			a = sc.nextInt();
			
			if(a == 0) {
				break; //반복문 탈출
			}
			
			i = 1;
			cnt=0;
			while(i <= a) {
				
				if(i % 3 ==0) {
					cnt++;
				}
				i++;
			}
			
			System.out.println("1부터 " + a + "까지 3의배수 개수 : " + cnt);
		}
	}

}
