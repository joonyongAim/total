package 메서드;

import java.util.Scanner;

public class RectMain {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력받아 : ");
		r.width = sc.nextInt();
		r.height = sc.nextInt();
		
		
		r.calArea();
		r.calPeri();

	}

}
