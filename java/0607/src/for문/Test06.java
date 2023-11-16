package for문;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		
		int i,a,result=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받아 : ");
		a = sc.nextInt();
		
		for(i=1;i<=a;i++) {
			result = result * i;
			
		}System.out.println("결과 : " + result);
		
		

	}

}
