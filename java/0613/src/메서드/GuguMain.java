package 메서드;

import java.util.Scanner;

public class GuguMain {

	public static void main(String[] args) {
		
		Gugu g = new Gugu();
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력받으면 : ");
		a = sc.nextInt();
		
		g.showGugu(a);
		
		

	}

}
