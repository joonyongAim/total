package switch연습;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력받아 : ");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'm' :
		case 'M' :
			System.out.println("남자");
			break;
		case 'f' :
		case 'F' :
			System.out.println("여자");
			break;	
		default :
			System.out.println("잘못 입력하셨습니다.");

	}

}
}
