package if연습;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한글자를 입력받아 : ");
		ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자를 입력하셨습니다.");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자를 입력하셨습니다.");
		}else {
			System.out.println("알파벳이 아닙니다.");
		}
			
		
		
		
	}

}
