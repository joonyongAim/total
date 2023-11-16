package while문;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		int i=1,a;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한개를 입력받아 : ");
		a = sc.nextInt();
		System.out.println("==== " + a + " 단====");
		while(i<=9) {
			System.out.println(a + " * " + i + " = " + i*a);
			i++;
		}
		
		

	}

}
