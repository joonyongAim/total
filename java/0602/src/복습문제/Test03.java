package 복습문제;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int mon;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("금액 : ");
		
		mon = sc.nextInt();
		
		
		
		System.out.println("5만원권 : " + mon / 50000 + "장");
		mon = mon % 50000;
		System.out.println("만원권 : " + mon / 10000 + "장"  );
		mon = mon % 10000;
		System.out.println("오천원 : " + mon / 5000 + "장");
		mon = mon % 5000;
		System.out.println("천원 : " + mon / 1000 + "장");
		
		
		

	}

}
