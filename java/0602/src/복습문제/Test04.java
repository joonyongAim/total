package 복습문제;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		int x,y;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자연수를 입력 : ");
		
		x = sc.nextInt();y = sc.nextInt();
		
//		System.out.println(x*(y%10));
//		System.out.println(x*(y%100/10));
//		System.out.println(x*(y/100));
//		System.out.println(x*y);
		
		System.out.printf("%5d\n",x*(y%10));
		System.out.printf("%4d\n",x*(y%100/10));
		System.out.printf("%d\n",x*(y/100));
		System.out.printf("%d\n",x*y);
		
		
		
				
		
		
		
		

	}

}
