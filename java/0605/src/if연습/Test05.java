package if연습;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		int a = 12000,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문수량을 입력받아 : ");
		   b = sc.nextInt();
	      
		
		if(a*b <= 15000) {
			System.out.println("주문금액 : " + (a*b));
			System.out.println("배달비 : " + 3000);
		}else if(a*b <= 30000) {
			System.out.println("주문금액 : " + (a*b));
			System.out.println("배달비 : " + 1500);
		}else {
			System.out.println("주문금액 : " + (a*b));
			System.out.println("배달비 : " + "무료");
		}
		
		
		

	}

}
