package 스레드2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		System.out.print("유저 아이디 입력 : ");
		id = sc.nextLine();
		
		Charactor user = new Charactor(id, 100);
		Charactor com = new Charactor("com", 100);
		
		PlayUser playUser = new PlayUser(user, com);
		PlayCom playCom = new PlayCom(user, com);
		
		playUser.start();
		playCom.start();

	}

}
